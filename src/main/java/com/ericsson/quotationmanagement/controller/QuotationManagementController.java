package com.ericsson.quotationmanagement.controller;

import com.ericsson.quotationmanagement.model.*;
import com.ericsson.quotationmanagement.repository.QuotationRepository;
import com.google.gson.Gson;

import java.util.List;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QuotationManagementController {
	
	@Autowired
	QuotationRepository quotationRepository;
	
	@PostMapping("/record")
    public String record_quotation(@RequestBody Quotation payload) throws Exception {
		
		quotationRepository.save(payload);
				
		return ("Quotation registered successfully");
        
    }

	@PostMapping("/read")
    public List<Quotation> read_quotation(@RequestBody Quotation payload) throws Exception {

		List<Quotation> listQuotes = quotationRepository.findByStockId(payload.getStockId());
		
		return (listQuotes);

    }
	
	@PostMapping("/readAll")
    public List<Quotation> readAll_quotation(@RequestBody Quotation payload) throws Exception {

		List<Quotation> listQuotes = quotationRepository.findAll();
		
		return (listQuotes);

    }
	
}
