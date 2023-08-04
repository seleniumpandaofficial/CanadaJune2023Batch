package com.day11.java;

public class Concept_Of_Methods {
	// What is a method ?
	// Methods are like factories
	// You give raw materials > processing > the product
	// Independent units of execution

	// Syntax of a method
	// accessmodifier + static/non-static + returntype + nameofthemethod(){ logic }
	//methods can have all the 4 access modifiers
	
	//static in java is property of the Class and not of the Object
	
	static int wheels = 4;

	public static void main(String[] args) {

		System.out.println("This is the main method");
		test1();
		test2();
		test3();
		test4();
		
	
		//test5(); //this is not a static member. This is a non-static memeber
		//test6();
		
		//rules of static
		//Rule1 - static can only call static. 
		//Rule 2 - static cannot call non-static
		
		//rules of non-static
		//Rule1 - non-static can call non-static as well as static
		//Rule2 - calling a static member via a non-static member is not a good practice

	}

	public static int test1() {
		int i=3, j=5;
		int k = i+j;
		System.out.println(k);
		return k; //k is int
		
	}

	private static String test2() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = S1 + S2;
		System.out.println(S3);
		test1();
		return S3; //S3 is String
		
		
	}

	protected static void test3() {
		System.out.println("This is the test3 method");
	}

	static void test4() {
		System.out.println("This is the test4 method");
		test3();
	}
	
	public void test5() {
		System.out.println("This is a nonstatic public method");
		test4(); //this is not a good practice because test4 is static in nature
		test6();
	}
	
	public void test6() {
		System.out.println("This is a nonstatic public method");
	}

}
