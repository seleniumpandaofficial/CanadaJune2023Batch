package com.oops.polymorphism_MethodOverloading;

public class Student {

	public static void main(String[] args) {
		Student student = new Student();
		student.name();
		student.name(10);
		student.name(10,20);
		student.name("John");
		student.name(new StringBuffer("Tom"));
		student.name(new StringBuilder("Kane"));

	}
	
	public void name() {
		System.out.println("This is a simple no argument/parameter method");
	}
	
	
	public void name(int i) {
		System.out.println("This is a simple with one int type argument/parameter method");
	}
	
	public void name(int k, int l) {
		System.out.println("This is a simple with two int type arguments/parameters method");
	}
	
	public void name(String s) {
		System.out.println("This is a simple with one String type argument/parameter method");
	}
	
	public void name(StringBuffer s) {
		System.out.println("This is a simple with one StringBuffer type argument/parameter method");
	}
	
	public void name(StringBuilder s) {
		System.out.println("This is a simple with one StringBuilder type argument/parameter method");
	}

}
