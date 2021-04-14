package com.demo.inventory.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="buydetail")
@Table(name="buydetail")
public class BuyDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idbuydetail")
	private Long idBuyDetail;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="buy_idbuy")
	private Buy buyIdBuy;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="product_idproduct")
	private Product productIdProduct;
	
	@Column(name="amount")
	private int amount;

	public Buy getBuyIdBuy() {
		return buyIdBuy;
	}

	public void setBuyIdBuy(Buy buyIdBuy) {
		this.buyIdBuy = buyIdBuy;
	}

	public Product getProductIdProduct() {
		return productIdProduct;
	}

	public void setProductIdProduct(Product productIdProduct) {
		this.productIdProduct = productIdProduct;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
