package ldp.ilprogetto.entita;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proj")
public class Proj {

	
	    @Id
	    @GeneratedValue
	    private Long id;
	    private String c_proj;
	    private String d_proj;
	    private String nome_pm;
	    private Integer effort;
	    private Date d_inizio;
	    private Date d_fine;
	   

	    public Proj() {
	    }
	    

	    public Proj(Long id, String c_proj, String d_proj, String nome_pm, Integer effort,
	    		Date d_inizio, Date d_fine) 
	    		{
	        this.id = id;
	        this.c_proj = c_proj;
	        this.d_proj = d_proj;
	        this.nome_pm = nome_pm;
	        this.effort = effort;
	        this.d_inizio = d_inizio;
	        this.d_fine = d_fine;
	        
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getC_proj() {
	        return c_proj;
	    }

	    public void setC_proj(String firstName) {
	        this.c_proj = firstName;
	    }

	    public String getD_proj() {
	        return d_proj;
	    }

	    public void setDproj(String lastName) {
	        this.d_proj = lastName;
	    }

	    public String getNome_pm() {
	        return nome_pm;
	    }

	    public void setNome_pm(String team) {
	        this.nome_pm = team;
	    }

	    public Integer getEffort() {
	        return effort;
	    }

	    public void setEffort(Integer effort) {
	        this.effort = effort;
	    }
	    public Date getD_inizio() {
	        return d_inizio;
	    }

	    public void setD_inizio(Date d_inizio) {
	        this.d_inizio = d_inizio;
	    }
	    public Date getD_fine() {
	        return d_fine;
	    }
	    public void setD_fine(Date d_fine) {
	        this.d_fine = d_fine;
	    }
	}
