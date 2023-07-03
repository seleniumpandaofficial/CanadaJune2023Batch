package com.day3.java;

public class Program3 {
	//operators in java
	
	//Arithmetic Operators
	//Assignment Operators
	//Comparison Operators
	//Logical Operators
	//Bitwise Operators

	public static void main(String[] args) {
		arithmeticOperators();		
		assignmentOperators();
		comparisonOperators();
		logicalOperators();
	}
	
	public static void arithmeticOperators() {
		//Arithmetic Operators + - * / % ++ --
				int i = 21;
				int j = 31;
				System.out.println(i + j);
				System.out.println(j - 1);
				System.out.println(i * j);
				System.out.println(i/j);
				System.out.println(i%j);
				
				//increment and decrement operators
				int k = 10;
				k++;
				System.out.println(k);
				
				int l = 9;
				--l;
				System.out.println(l);
	}
	
	public static void assignmentOperators() {
		int x = 10;
		//  =   +=  -=   *=   /=    %=   &=   |=   ^=   >>=   <<=
		x += 3;    //x = x+3;
		System.out.println("The value of x is:"+ x);
	}
	
	public static void comparisonOperators() {
		//   ==    !=    >     <   >=    <=
		
		int i = 10;
		int j = 10;
		System.out.println(i != j);
		System.out.println(i == j);
	}

	public static void logicalOperators() {
		
		//   && Logical And,   || Logical OR,   !  Logical Not
		
		// && - returns true if both statements are true
		// || - returns true if one of the statements is true
		//  ! - reverses the result, returns false if the result is true
		
		int i = 5;
		int j = 10;
		
		System.out.println("Output is:"+ (i<j && i<9));
		System.out.println("Output is:"+ (i<j || i>9));
		System.out.println("Output is:"+ (i>j || i>9));
		System.out.println("Output is:"+ !(i<j && i<9));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
