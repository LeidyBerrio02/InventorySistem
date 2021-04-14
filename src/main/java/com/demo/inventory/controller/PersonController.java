package com.demo.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.inventory.model.Person;
import com.demo.inventory.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping()
	public List<Person> listAllPersons(){
		return personService.listAllPerson();
	}
	
	@GetMapping("/customer")
	public List<Person> listCustomer(){
		return personService.listCustomer();
	}
	
	@GetMapping("/supplier")
	public List<Person> listSupplier(){
		return personService.listSupplier();
	}
	
}
