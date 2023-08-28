package com.day13.java_Wrapper_Classes;

public class Boxing_Unboxing {
	
	//Character and Boolean Wrapper Classes = parent is Object Class
	//Integer, Short, Long, Byte, Double, Float = parent class is Number Class
	
	//What is Boxing?
	// Conversion of primitive data types to Wrapper Class Objects
	
	//What is Unboxing?
	// Coversion of Wrapper Class Objects to primitive data types

	public static void main(String[] args) {
	
		normalBoxingExample();
		autoBoxingExample();
		normalUnBoxingExample();
		autoUnBoxingExample();
	}
	
	
	public static void normalBoxingExample() {
		int a = 100;
		Integer b = Integer.valueOf(a);
		System.out.println("Wrapper Class Object : " + b);
		
	}
	
	public static void autoBoxingExample() {
		int a = 20;
		Integer b = a;
		System.out.println("Wrapper Class Object using Autoboxing :" + b);
	}
	
	public static void normalUnBoxingExample() {
		Integer value = 200;
		int result = value.intValue();
		System.out.println("The primitive data type int value is :" + result);
		
	}
	
	public static void autoUnBoxingExample() {
		Integer value = 100;
		int result = value;
		System.out.println(result);
		
		
	}
	

}
