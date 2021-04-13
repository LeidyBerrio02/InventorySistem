package com.demo.inventory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.inventory.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

	Optional<Sale> findById(Long idSale);
	
}
