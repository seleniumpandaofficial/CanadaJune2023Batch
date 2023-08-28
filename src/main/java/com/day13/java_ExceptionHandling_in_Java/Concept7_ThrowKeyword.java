package com.day13.java_ExceptionHandling_in_Java;

public class Concept7_ThrowKeyword {
	
	public static void main(String[] args) { //abnormally terminate the main method
		Concept7_ThrowKeyword ref = new Concept7_ThrowKeyword();
		ref.divideByZero();
	}
	
	
	public void divideByZero() { //abnormally terminate this method
		int a=100, b=0, c;
		c = a/b;
		System.out.println(c);
	}
	
	//jvm will handover the Object to Default Exception Handler

}
