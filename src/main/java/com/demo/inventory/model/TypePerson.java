package com.demo.inventory.model;

import java.util.List;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="typeperson")
@Table(name="typeperson")
public class TypePerson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idtypeperson")
	private Long idTypePerson;
	
	@Column(name="typeperson")
	private String typePerson;

	@JsonIgnore
	@OneToMany(mappedBy = "typePerson", fetch = FetchType.LAZY)
	private List<Person> persons;

	
	public Long getIdTypePerson() {
		return idTypePerson;
	}

	public void setIdTypePerson(Long idTypePerson) {
		this.idTypePerson = idTypePerson;
	}

	public String getTypePerson() {
		return typePerson;
	}

	public void setTypePerson(String typePerson) {
		this.typePerson = typePerson;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	
}
