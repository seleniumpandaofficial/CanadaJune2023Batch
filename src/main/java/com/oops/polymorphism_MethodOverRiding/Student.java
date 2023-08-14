package com.oops.polymorphism_MethodOverRiding;

public class Student extends School{

	public static void main(String[] args) {
	        Student student = new Student();
	        student.education();
	        student.mandatoryFees(1000);
	              

	}
	
	public void education() {
		System.out.println("This is Child's education method");
	}
	
	public void mandatoryFees(int i) {
		System.out.println("This is child's class mandFee with int parameter method");
	}

}
