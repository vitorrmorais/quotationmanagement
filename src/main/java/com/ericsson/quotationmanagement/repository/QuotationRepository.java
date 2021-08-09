package com.ericsson.quotationmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericsson.quotationmanagement.model.Quotation;

public interface QuotationRepository extends JpaRepository<Quotation, String> {
	
	List<Quotation> findByStockId(String stockId);

}
