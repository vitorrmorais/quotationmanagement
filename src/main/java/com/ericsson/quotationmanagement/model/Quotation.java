package com.ericsson.quotationmanagement.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="QUOTATION")
public class Quotation implements Serializable{
	
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="stockId")
	private String stockId;
	
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Quotes> quotes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public List<Quotes> getQuotes() {
		return quotes;
	}

	public void setQuotes(List<Quotes> quotes) {
		this.quotes = quotes;
	}

}
