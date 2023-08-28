package com.day13.java_ExceptionHandling_in_Java;

public class Concept5_PrintExceptionInformation {

	public static void main(String[] args) {
		try {
			int a=100, b=0, c;
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			
			e.printStackTrace(); //prints ExceptionName, Description and also stack trace
			System.out.println(e); //prints ExceptionName and Description. But no stack trace
			System.out.println(e.toString()); //prints ExceptionName and Description. But no stack trace
			System.out.println(e.getMessage()); //prints Description only. No ExceptionName, no stack trace
		}

	}

}
