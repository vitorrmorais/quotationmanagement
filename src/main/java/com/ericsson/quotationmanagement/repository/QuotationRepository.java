package com.ericsson.quotationmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericsson.quotationmanagement.model.Quotation;

import java.util.ArrayList;
import java.util.List;

public interface QuotationRepository extends JpaRepository<Quotation, String> {
	
	List<Quotation> findByStockId(String stockId);

}
