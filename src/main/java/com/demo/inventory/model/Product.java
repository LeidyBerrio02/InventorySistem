package com.demo.inventory.model;

import java.util.List;

import javax.persistence.*;

@Entity(name="product")
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproduct")
	private Long idProduct;
	
	@Column(name="code")
	private String code;
	
	@Column(name="nameProduct")
	private String nameProduct;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="price")
	private double price;

	/*@OneToMany(mappedBy = "productIdProduct", fetch = FetchType.EAGER)
	private List<BuyDetail> buyDetail;
	
	@OneToMany(mappedBy = "productIdProduct", fetch = FetchType.EAGER)
	private List<SaleDetail> saleDetail;*/
	
	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	public List<BuyDetail> getBuyDetail() {
		return buyDetail;
	}

	public void setBuyDetail(List<BuyDetail> buyDetail) {
		this.buyDetail = buyDetail;
	}

	public List<SaleDetail> getSaleDetail() {
		return saleDetail;
	}

	public void setSaleDetail(List<SaleDetail> saleDetail) {
		this.saleDetail = saleDetail;
	}
	
*/	
	
}
