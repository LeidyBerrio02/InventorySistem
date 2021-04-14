package com.demo.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.inventory.model.TypePerson;
import com.demo.inventory.service.TypePersonService;

@RestController
@RequestMapping("/api/typeperson")
public class TypePersonController {

	@Autowired
	private TypePersonService typePersonService;
	
	@GetMapping()
	public List<TypePerson> listTypePerson(){
		return typePersonService.listTypePerson();
	}
	
}
