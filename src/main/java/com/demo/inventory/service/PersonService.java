package com.demo.inventory.service;

import java.util.List;

import com.demo.inventory.model.Person;

public interface PersonService {

	List<Person> listCustomer();
	List<Person> listSupplier();
	Person create(Person person);
	
}
