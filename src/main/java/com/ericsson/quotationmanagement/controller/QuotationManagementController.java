package com.ericsson.quotationmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericsson.quotationmanagement.model.Quotation;
import com.ericsson.quotationmanagement.model.Stock;
import com.ericsson.quotationmanagement.repository.QuotationRepository;
import com.ericsson.quotationmanagement.resources.ApiClient;
import com.ericsson.quotationmanagement.resources.StockUtil;

@RestController
@RequestMapping("/")
public class QuotationManagementController {
	
	@Autowired
	QuotationRepository quotationRepository;
	
	@PostMapping("/create")
    public String record_quotation(@RequestBody Quotation payload) throws Exception {
		
		//Consumes the stock-manager API and returns registered stocks
		ApiClient apiClient = new ApiClient();
		Stock[] stock = ApiClient.consumeStock();
		
		//Validates if the stock to be registered exists in the stock-manager API
		StockUtil stockUtil = new StockUtil();
		if (!stockUtil.ExistsStock(stock, payload.getStockId())) {
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
