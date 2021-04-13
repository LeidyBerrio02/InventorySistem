package com.demo.inventory.service;

import java.util.List;

import com.demo.inventory.model.Product;

public interface ProductService {

	List<Product> listProduct();
	Product create(Product product);
	
}
