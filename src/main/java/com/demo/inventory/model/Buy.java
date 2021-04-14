package com.demo.inventory.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="buy")
@Table(name="buy")
public class Buy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idbuy")
	private Long idBuy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateBuy;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="total")
	private double price;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="supplier")
	private Person supplier;
	
	/*@OneToMany(mappedBy = "buyIdBuy", fetch = FetchType.EAGER)
	private List<BuyDetail> buyDetail;*/

	public Long getIdBuy() {
		return idBuy;
	}

	public void setIdBuy(Long idBuy) {
		this.idBuy = idBuy;
	}

	public Date getDateBuy() {
		return dateBuy;
	}

	public void setDateBuy(Date dateBuy) {
		this.dateBuy = dateBuy;
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

	public Person getSupplier() {
		return supplier;
	}

	public void setSupplier(Person supplier) {
		this.supplier = supplier;
	}
/*
	public List<BuyDetail> getBuyDetail() {
		return buyDetail;
	}

	public void setBuyDetail(List<BuyDetail> buyDetail) {
		this.buyDetail = buyDetail;
	}
*/
	
}
