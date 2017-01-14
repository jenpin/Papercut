package com.print.utils;

import java.util.HashMap;

public class PrintConstants {

	public enum PageType{
		A4("A4");
		
		private final String value;
		
		private PageType(String value){
			this.value=value;
		}
		
		 public String getValue() {
		        return value;
		}
	}
	
	public static HashMap<String,Integer> priceMap = new HashMap();
	static {
		priceMap.put("A4_SINGLE_BLACK_WHITE", 15);
		priceMap.put("A4_SINGLE_COLOUR", 25);
		priceMap.put("A4_DOUBLE_BLACK_WHITE", 10);
		priceMap.put("A4_DOUBLE_COLOUR", 20);
	}

   


}
