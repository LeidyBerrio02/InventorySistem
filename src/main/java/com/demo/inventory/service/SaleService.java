package com.demo.inventory.service;

import java.util.List;

import com.demo.inventory.model.Sale;
import com.demo.inventory.model.SaleDetail;

public interface SaleService {

	List<Sale> listSale();
	List<Sale> total();
	List<SaleDetail> listDetail();
}
