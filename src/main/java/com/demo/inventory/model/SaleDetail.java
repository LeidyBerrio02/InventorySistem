package com.demo.inventory.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="saledetail")
@Table(name="saledetail")
public class SaleDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idsaledetail")
	private Long idSaleDetail;
	
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="sale_idsale")
	private Sale saleIdSale;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="product_idproduct")
	private Product productIdProduct;

	@Column(name="amount")
	private int amount;

	
	public Long getIdSaleDetail() {
		return idSaleDetail;
	}

	public void setIdSaleDetail(Long idSaleDetail) {
		this.idSaleDetail = idSaleDetail;
	}

	public Sale getSaleIdSale() {
		return saleIdSale;
	}

	public void setSaleIdSale(Sale saleIdSale) {
		this.saleIdSale = saleIdSale;
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
