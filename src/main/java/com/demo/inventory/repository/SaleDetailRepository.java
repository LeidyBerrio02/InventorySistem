package com.demo.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.inventory.model.SaleDetail;

@Repository
public interface SaleDetailRepository extends JpaRepository<SaleDetail,Long>{

}
