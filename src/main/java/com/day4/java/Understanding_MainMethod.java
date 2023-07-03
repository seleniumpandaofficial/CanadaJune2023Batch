package com.day4.java;

public class Understanding_MainMethod {
	
	//Why are we learning main method ?
	//Why is main method always static ?
	//Can we change the structure of main method ?
	
	
	//main method is the entry point
	//only main method has the execution power. No other method in java has execution power
	//you write a program. Certain logic you will write. 
	
	//What is Java - Object Oriented Programming language
	//Object is important 
	
	public static void main(String[] args) {
		
		System.out.println("I am learning java");
		addition();
		StringAddition();
		
	}
	
	public static int addition() {
		int i = 10, j = 20;
		int sum = i+j;
		
		System.out.println(sum); //printing the addition of two integers which is nothing but an integer only
		return sum; //returning an integer. So technically, an integer is getting returned
	}
	
	public static String StringAddition() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = S1 + S2;
		System.out.println(S3);
		return S3;
	}

}
