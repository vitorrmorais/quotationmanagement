package com.ericsson.quotationmanagement.resources;

import java.io.UnsupportedEncodingException;

import com.ericsson.quotationmanagement.model.Stock;

public class StockUtil {
	
	public static boolean ExistsStock(String pStock) {
		
		//Consumes the stock-manager API and returns registered stocks
		Stock[] stock = null;
		try {
			stock = ApiClient.consumeStock();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Stock stockActual : stock) {
			if (stockActual.getId().equals(pStock)) {
				return true;
			}
		}
		
		return false;
		
	}
	
}
