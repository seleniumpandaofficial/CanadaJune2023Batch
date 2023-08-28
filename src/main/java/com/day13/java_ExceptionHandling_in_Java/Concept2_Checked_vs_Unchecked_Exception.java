package com.day13.java_ExceptionHandling_in_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Concept2_Checked_vs_Unchecked_Exception {
	
	//no Exceptions occur at Compile Time

	public static void main(String[] args) {
		
		arithmeticExcpetionValidation();
		fileNotFoundExceptionValidation();
		classNotFoundException();
		

	}
	
	public static void fileNotFoundExceptionValidation() {
		try {
			FileInputStream ip = new FileInputStream("Desktop//abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello World");
	}
	
	public static void classNotFoundException() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Grass is Green");
	}
	
	public static void arithmeticExcpetionValidation() {
		int a = 100, b=0, c;
		c = a/b; //here exception has occurred but compiler is not saying anything
		// Runtime or unchecked Exception
		System.out.println(c);
	}
	
	

}
