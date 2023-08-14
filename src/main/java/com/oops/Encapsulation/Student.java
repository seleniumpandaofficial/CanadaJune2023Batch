package com.oops.Encapsulation;

public class Student {
	
	private String name; //data hiding
	private int age;     //data hiding
	
	public void setData(String n, int a) {
		name = n;
		age = a;
		
	}
	
	public String getData1() {
		return name;
	}
	
	public int getData2() {
		return age;
	}

}
