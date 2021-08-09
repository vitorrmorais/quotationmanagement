package com.ericsson.quotationmanagement.resources;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.client.RestTemplate;

import com.ericsson.quotationmanagement.model.Stock;

public class ApiClient {

	public static Stock[] consumeStock() {

		String url = "http://localhost:8080/stock";

		RestTemplate restTemplate = new RestTemplateBuilder()
				.rootUri(url)
				.build();
		
		Stock[] stock = restTemplate.getForObject(url, Stock[].class);
		
		return stock;
	}
	
}