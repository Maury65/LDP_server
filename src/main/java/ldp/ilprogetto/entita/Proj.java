package ldp.ilprogetto.entita;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proj")
public class Proj {

	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		
		@Column(name = "c_proj")
		private String codProgetto;
		
		@Column(name = "d_proj")
	    private String descProgetto;
		
		@Column(name = "nome_pm")
	    private String nomePM;
		
		private Integer effort;

	    @Column(name = "d_inizio")
		private Date dataInizio;
		
		@Column(name = "d_fine")
	    private Date dataFine;
	   

	    public Proj() {
	    }

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the codProgetto
		 */
		public String getCodProgetto() {
			return codProgetto;
		}

		/**
		 * @param codProgetto the codProgetto to set
		 */
		public void setCodProgetto(String codProgetto) {
			this.codProgetto = codProgetto;
		}

		/**
		 * @return the descProgetto
		 */
		public String getDescProgetto() {
			return descProgetto;
		}

		/**
		 * @param descProgetto the descProgetto to set
		 */
		public void setDescProgetto(String descProgetto) {
			this.descProgetto = descProgetto;
		}

		/**
		 * @return the nomePM
		 */
		public String getNomePM() {
			return nomePM;
		}

		/**
		 * @param nomePM the nomePM to set
		 */
		public void setNomePM(String nomePM) {
			this.nomePM = nomePM;
		}

		/**
		 * @return the effort
		 */
		public Integer getEffort() {
			return effort;
		}

		/**
		 * @param effort the effort to set
		 */
		public void setEffort(Integer effort) {
			this.effort = effort;
		}

		/**
		 * @return the dataInizio
		 */
		public Date getDataInizio() {
			return dataInizio;
		}

		/**
		 * @param dataInizio the dataInizio to set
		 */
		public void setDataInizio(Date dataInizio) {
			this.dataInizio = dataInizio;
		}

		/**
		 * @return the dataFine
		 */
		public Date getDataFine() {
			return dataFine;
		}

		/**
		 * @param dataFine the dataFine to set
		 */
		public void setDataFine(Date dataFine) {
			this.dataFine = dataFine;
		}
			
		
		
	}
