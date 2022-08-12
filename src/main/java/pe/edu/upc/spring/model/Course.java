package pe.edu.upc.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_curso;
	private String nombre_curso;
	
	@ManyToMany(fetch= FetchType.LAZY, 
			cascade= {
					CascadeType.PERSIST,
					CascadeType.MERGE
			
	},
	mappedBy = "cursos")
	private Set<Teacher> teachers = new HashSet<Teacher>();

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public String getNombre_curso() {
		return nombre_curso;
	}

	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	
}
