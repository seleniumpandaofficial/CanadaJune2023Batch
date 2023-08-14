package com.oops.polymorphism_MethodOverloading;

public class Automatic_Promotion {

	public static void main(String[] args) {
		Automatic_Promotion ref = new Automatic_Promotion();
		ref.display(10);
		ref.display("Selenium");
		ref.display('c'); //char is getting auto promoted to int
		

	}
	
	public void display(int i) {
		System.out.println("int method");
	}
	
	public String display(String S) {
		System.out.println("This is String method");
		return S;
	}
	
	/*
	 * public void display(char c) { System.out.println("This is char method"); }
	 */

}
