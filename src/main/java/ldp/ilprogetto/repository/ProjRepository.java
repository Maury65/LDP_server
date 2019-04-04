package ldp.ilprogetto.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ldp.ilprogetto.entita.Proj;

@RepositoryRestResource(collectionResourceRel = "proj", path = "proj")
public interface ProjRepository extends PagingAndSortingRepository<Proj, Long> {

    public Page<Proj> findByCodProgettoContainingOrNomePMContainingOrDescProgettoContaining(
        @Param("codProgetto") String codProgetto,
        @Param("nomePM") String nomeCP,
        @Param("descProgetto") String descProgetto,
        Pageable pageable);

   
}
