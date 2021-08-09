package com.ericsson.quotationmanagement.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import javax.persistence.Table;

@Entity
@Table(name="QUOTES")
public class Quotes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="dateQt")
	private String dateQt;
	
	@Column(name="valueQt")
	private String valueQt;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateQt() {
		return dateQt;
	}

	public void setDateQt(String dateQt) {
		this.dateQt = dateQt;
	}

	public String getValueQt() {
		return valueQt;
	}

	public void setValueQt(String valueQt) {
		this.valueQt = valueQt;
	}


}
