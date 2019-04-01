package ldp.ilprogetto.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ldp.ilprogetto.entita.Proj;

@RepositoryRestResource(collectionResourceRel = "proj", path = "proj")
public interface ProjRepository extends PagingAndSortingRepository<Proj, Long> {

//	List<Person> findByLastName(@Param("name") String name);

	   
    // @Query("")
    //  @Query("SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName)")
	// public Page<Proj> byClosed(Pageable pageable, @Param("text") String text);

}


