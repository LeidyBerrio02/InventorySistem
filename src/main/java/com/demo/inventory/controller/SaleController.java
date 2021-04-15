package com.demo.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.inventory.model.Sale;
import com.demo.inventory.model.SaleDetail;
import com.demo.inventory.service.SaleService;

@RestController
@RequestMapping("/api/sale")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public List<Sale> listSale(){
		return saleService.listSale();
	}
	
	@GetMapping("/detail")
	public List<SaleDetail> listDetail(){
		return saleService.listDetail();
	}
	
	
	@GetMapping("/total")
	public List<Sale> total(){
		return saleService.total();
	}
	
}
