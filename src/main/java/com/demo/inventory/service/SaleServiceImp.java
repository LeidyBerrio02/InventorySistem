package com.demo.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.inventory.model.Sale;
import com.demo.inventory.repository.SaleRepository;

@Service

public class SaleServiceImp implements SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Override
	public List<Sale> listSale() {
		// TODO Auto-generated method stub
		return saleRepository.findAll();
	}

}
