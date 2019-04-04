package ldp.ilprogetto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import ldp.ilprogetto.entita.Proj;
import ldp.ilprogetto.repository.ProjRepository;

@SpringBootApplication
public class IlprogettoApplication {

	@Autowired ProjRepository projRepository;

	public static void main(String[] args) {
		SpringApplication.run(IlprogettoApplication.class, args);
	}

	@EventListener
	public void onApplicationReady(ApplicationReadyEvent event) {
		//projRepository.deleteAll();
		
		//SE IL DB è VUOTO VIENE INIZIALIZZATO
		if (projRepository.count()==0) {
			System.out.println("Inizializzazione db");
			for (int i = 1; i < 1000; i++) {
				Proj p = new Proj();
			
				p.setCodProgetto("IT" + String.format("%07d", i));
				p.setDataInizio(new Date());
				p.setDataFine(new Date());
				p.setDescProgetto("Descrizione Progetto prova " + i);
				p.setEffort(i);
				p.setNomePM("Maurizio" + i );


				projRepository.save(p);
			}
		}
	}

}
