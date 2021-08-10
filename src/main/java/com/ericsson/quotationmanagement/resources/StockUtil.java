package com.ericsson.quotationmanagement.resources;

import com.ericsson.quotationmanagement.model.Stock;

public class StockUtil {
	
	public static boolean ExistsStock(String pStock) {
		
		//Consumes the stock-manager API and returns registered stocks
		Stock[] stocks = ApiClient.consumeStock();
		
		//Validates if the stock to be registered exists in the stock-manager
		for (Stock stock : stocks) {
			if (stock.getId().equals(pStock)) {
				return true;
			}
		}
		
		return false;
		
	}
	
}
