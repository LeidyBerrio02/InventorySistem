package com.demo.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.inventory.model.TypePerson;
import com.demo.inventory.repository.TypePersonRepository;

@Service
public class TypePersonServiceImp implements TypePersonService{
	
	@Autowired
	private TypePersonRepository typePersonRepository;

	@Override
	public List<TypePerson> listTypePerson() {
		// TODO Auto-generated method stub
		return typePersonRepository.findAll();
	}


}
