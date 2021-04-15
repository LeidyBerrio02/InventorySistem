package com.demo.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.inventory.model.BuyDetail;

@Repository
public interface BuyDetailRepository extends JpaRepository<BuyDetail, Long>{

}
