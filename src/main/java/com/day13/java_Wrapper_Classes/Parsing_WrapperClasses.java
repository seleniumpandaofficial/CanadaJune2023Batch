package com.day13.java_Wrapper_Classes;

public class Parsing_WrapperClasses {

	public static void main(String[] args) {

		stringToInteger();
		stringToDouble();
	}

	public static void stringToInteger() {
		String price1 = "44";
		String price2 = "199";

		// int result = price1 + price2; - this statement is not possible
    	// System.out.println(price1 + price2); - this is not going to work
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		int sum = p1 + p2;
		System.out.println(sum);

	}
	
	public static void stringToDouble() {
		String price1 = "44.79";
		String price2 = "199.39";
		
		double d1 = Double.parseDouble(price1);
		double d2 = Double.parseDouble(price2);
		
		double sum = d1 + d2;
		System.out.println(sum);
	}

}
