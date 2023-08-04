package com.day11.java;

public class Concept_Of_Objects {

	// there are 5 ways we can create Objects in java

	// 1. new keyword
	// 2. newInstance() method
	// 3. clone() method
	// 4. deserialization
	// 5. factory methods

	// What is an Object ?
	// Ans: Object is instance of A class

	// instance means - single occurrence
	// single occurrence - can it be repeated ??

	// Object occupied memory because it is a physical entity
	// properties of an object:-
	// 1. Identity [name]
	// 2. State [Breed / Color / Age]
	// 3. Behavior [Barking / Sleeping / Drinking / Eating / Guarding]

	// Categorization of an object is simpler to Class ? ? True or False ??
	
	//Object is also known as collection of all non-static entities of the class
	
	int rollnumber;
	String name;
	boolean promotion;

	public static void main(String[] args) {

		new Concept_Of_Objects(); //this is the object
		//using the object reference we can call the non-static entities
		
		Concept_Of_Objects ref = new Concept_Of_Objects();
		ref.test5();
		ref.test6();
		test1();
		Concept_Of_Objects.test1(); //using the Class to call the static entities is
		//mostly practiced when other classes are involved. Generally in the same
		//class we call the static entities directly.
		
		ref.rollnumber = 123;
		ref.name = "John";
		ref.promotion = false;
				
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
