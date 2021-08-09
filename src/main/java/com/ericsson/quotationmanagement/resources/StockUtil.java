package com.ericsson.quotationmanagement.resources;

import com.ericsson.quotationmanagement.model.Stock;

public class StockUtil {
	
	public static boolean ExistsStock(Stock[] stock, String stockNew) {
		
		for (Stock stockActual : stock) {
			if (stockActual.getId().equals(stockNew)) {
				return true;
			}
		}
		
		return false;
		
	}
}
