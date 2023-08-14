package com.oops.polymorphism_MethodOverloading;

public class OverloadingExample {

	public static void main(String[] args) {
	
		OverloadingExample ref = new OverloadingExample();
		ref.add(10, 20);
		ref.add(1.1, 2.2);
		ref.add("Hello", "world");
	}
	
	public void add(int a, int b) {
		a = 10; b =20;
        System.out.println(a + b);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

}
