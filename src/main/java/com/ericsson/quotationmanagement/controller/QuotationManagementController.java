package com.ericsson.quotationmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericsson.quotationmanagement.model.Quotation;
import com.ericsson.quotationmanagement.repository.QuotationRepository;
import com.ericsson.quotationmanagement.resources.StockUtil;

@RestController
@RequestMapping("/")
public class QuotationManagementController {
	
	@Autowired
	QuotationRepository quotationRepository;
	
	@PostMapping("/create")
    public String record_quotation(@RequestBody Quotation payload) throws Exception {
		
		//Validates if the stock to be registered exists in the stock-manager API
		if (!StockUtil.ExistsStock(payload.getStockId())) {
			return ("This stock does not exist.");
		}
		
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
