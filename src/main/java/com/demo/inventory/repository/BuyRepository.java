package com.demo.inventory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.inventory.model.Buy;

@Repository
public interface BuyRepository extends JpaRepository<Buy, Long>{

	Optional<Buy> findById(Long idbuy);
	
}
