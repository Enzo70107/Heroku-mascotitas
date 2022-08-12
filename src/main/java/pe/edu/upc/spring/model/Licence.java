package pe.edu.upc.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="licencia")
public class Licence {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lid;
	private String lcategoria;
	private String fechaEmision;
	
	@OneToOne
	@JoinColumn(name = "id_person", nullable=false )
	private Person person;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLcategoria() {
		return lcategoria;
	}

	public void setLcategoria(String lcategoria) {
		this.lcategoria = lcategoria;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
		
}
