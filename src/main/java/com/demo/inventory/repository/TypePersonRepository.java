package com.demo.inventory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.inventory.model.TypePerson;

@Repository
public interface TypePersonRepository extends JpaRepository<TypePerson, Long>{

	Optional<TypePerson> findById(Long idTypePerson);
	
}
