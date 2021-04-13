package com.demo.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.inventory.model.Person;
import com.demo.inventory.repository.PersonRepository;

@Service
public class PersonServiceImp implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> listCustomer() {
		// TODO Auto-generated method stub
		return personRepository.listCustomer();
	}

	@Override
	public List<Person> listSupplier() {
		// TODO Auto-generated method stub
		return personRepository.listSupplier();
	}

	@Override
	public Person create(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

}
