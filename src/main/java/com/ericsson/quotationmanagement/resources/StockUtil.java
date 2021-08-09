package com.ericsson.quotationmanagement.resources;

import com.ericsson.quotationmanagement.model.Stock;

public class StockUtil {
	
	public static boolean ExistsStock(String pStock) {
		
		//Consumes the stock-manager API and returns registered stocks
		Stock[] stock = ApiClient.consumeStock();
		
		for (Stock stockActual : stock) {
			if (stockActual.getId().equals(pStock)) {
				return true;
			}
		}
		
		return false;
		
	}
	
}
