package com.demo.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.inventory.model.Buy;
import com.demo.inventory.service.BuyService;

@RestController
@RequestMapping("/api/buy")
public class BuyController {

	@Autowired
	private BuyService buyService;
	
	@GetMapping()
	public List<Buy> listBuy(){
		return buyService.listBuy();
	}
}
