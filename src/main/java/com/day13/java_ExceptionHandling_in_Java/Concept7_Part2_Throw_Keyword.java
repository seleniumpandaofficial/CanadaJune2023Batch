package com.day13.java_ExceptionHandling_in_Java;

public class Concept7_Part2_Throw_Keyword {

	public static void main(String[] args) {
		int a=100, b=0, c;
		c = a/b;
		System.out.println(c);
		throw new ArithmeticException();
		//Exception Object is passed to the JVM by the Programmer. main() method has no role in it
		
		//throw keyword is used to create the Exception Object by the Programmer and passed it to the JVM.
		
		//throw is basically used for Custom/User defined Exceptions. Avoid using it for Pre-defined Exceptions

	}

}
