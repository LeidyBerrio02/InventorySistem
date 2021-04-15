package com.demo.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.inventory.model.Sale;
import com.demo.inventory.model.SaleDetail;
import com.demo.inventory.repository.SaleDetailRepository;
import com.demo.inventory.repository.SaleRepository;

@Service

public class SaleServiceImp implements SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SaleDetailRepository saleDetailRepository;
	
	
	@Override
	public List<Sale> listSale() {
		return saleRepository.findAll();
	}     
	

	@Override
	public List<SaleDetail> listDetail() {
		// TODO Auto-generated method stub
		return saleDetailRepository.findAll();
	}

	@Override
	public List<Sale> total() {
		List<Sale> listSale = listSale();
		List<SaleDetail> sd = listDetail();
		SaleDetail obj = new SaleDetail(); 
		
		for (int i = 0 ; i < 2; i++ ) {
			double total = 0;
			
			total = total + sd.get(i).getProductIdProduct().getPrice();

			Sale sale = new Sale();
			sale.setTotal(total);
			sale.setIdSale(listSale.get(i).getIdSale());
			sale.setSaleDetail(listSale.get(i).getSaleDetail());
			listSale.set(i, sale);
			
		}
		return listSale;

		
	}


}
