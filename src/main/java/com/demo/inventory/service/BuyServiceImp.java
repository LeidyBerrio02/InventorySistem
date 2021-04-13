package com.demo.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.inventory.model.Buy;
import com.demo.inventory.repository.BuyRepository;

@Service
public class BuyServiceImp implements BuyService{

	@Autowired
	private BuyRepository buyRepository;
	
	@Override
	public List<Buy> listBuy() {
		// TODO Auto-generated method stub
		return buyRepository.findAll();
	}

	
}
