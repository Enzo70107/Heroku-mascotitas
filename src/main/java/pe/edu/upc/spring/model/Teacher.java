package pe.edu.upc.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="docente")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_teacher;
	private String name_teacher;
	
	@ManyToMany(fetch= FetchType.LAZY, 
			cascade= {
					CascadeType.PERSIST,
					CascadeType.MERGE
			
	})
	@JoinTable(name="docente_curso",
	joinColumns= {@JoinColumn(name="teacher_id_teacher")},
	inverseJoinColumns = {@JoinColumn(name="curso_id_curso")}
	)
	private Set<Course> cursos=new HashSet<Course>();

	public int getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}

	public String getName_teacher() {
		return name_teacher;
	}

	public void setName_teacher(String name_teacher) {
		this.name_teacher = name_teacher;
	}

	public Set<Course> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Course> cursos) {
		this.cursos = cursos;
	}
	
	
}
