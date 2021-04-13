package com.demo.inventory.model;

import java.util.List;

import javax.persistence.*;

@Entity(name="person")
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idperson")
	private Long idPerson;
	
	@Column(name="fistname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="wallet")
	private double wallet;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typePerson")
	private TypePerson typePerson;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	private List<Sale> salesCustomer;
	
	@OneToMany(mappedBy = "supplier", fetch = FetchType.EAGER)
	private List<Buy> buySupplier;

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	public TypePerson getTypePerson() {
		return typePerson;
	}

	public void setTypePerson(TypePerson typePerson) {
		this.typePerson = typePerson;
	}

	public List<Sale> getSalesCustomer() {
		return salesCustomer;
	}

	public void setSalesCustomer(List<Sale> salesCustomer) {
		this.salesCustomer = salesCustomer;
	}

	public List<Buy> getBuySupplier() {
		return buySupplier;
	}

	public void setBuySupplier(List<Buy> buySupplier) {
		this.buySupplier = buySupplier;
	}
	
	
	
}
