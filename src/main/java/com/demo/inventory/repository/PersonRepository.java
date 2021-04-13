package com.demo.inventory.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.inventory.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	Optional<Person> findById(Long idPerson);
	
	@Query(
			value = "SELECT * FROM person WhERE typePerson = 1 ", nativeQuery = true)
	public List<Person> listCustomer();
	
	@Query(
			value = "SELECT * FROM PERSON WhERE typePerson = 2", nativeQuery = true)
	public List<Person> listSupplier();
	
	
}