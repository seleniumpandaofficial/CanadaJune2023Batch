package com.day11.java;

public class Execution {

	public static void main(String[] args) {
		hello();
		hello1();
		
		
		Execution ref = new Execution();
		ref.hello2();
		ref.hello2();
		
		Dependent.blue();
		Dependent.green();
		
		Dependent ref1 = new Dependent();
		ref1.red();
		ref1.pink();
	}
	
	public static void hello() {
		System.out.println("This is static hello");
	}
	
	public static void hello1() {
		System.out.println("This is static hello1");
	}
	
	public void hello2() {
		System.out.println("This is non static hello2");
	}
	
	public void hello3() {
		System.out.println("This is non static hello3");
	}

}
