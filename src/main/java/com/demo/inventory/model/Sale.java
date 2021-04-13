package com.demo.inventory.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="sale")
@Table(name="sale")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idsale")
	private Long idSale;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateSale;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="total")
	private double total;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customer")
	private Person customer;
	
	@OneToMany(mappedBy = "sale_idSale", fetch = FetchType.EAGER)
	private List<SaleDetail> saleDetail;

	public Long getIdSale() {
		return idSale;
	}

	public void setIdSale(Long idSale) {
		this.idSale = idSale;
	}

	public Date getDateSale() {
		return dateSale;
	}

	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Person getCustomer() {
		return customer;
	}

	public void setCustomer(Person customer) {
		this.customer = customer;
	}

	public List<SaleDetail> getSaleDetail() {
		return saleDetail;
	}

	public void setSaleDetail(List<SaleDetail> saleDetail) {
		this.saleDetail = saleDetail;
	}
	
	
	
}
