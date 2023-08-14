package com.oops.abstraction_AbstractClass;

public abstract class Student {
	
	String name;
	int age;
	
	
	public abstract void studentMarksheet(); //this is an abstract method
	
	public abstract void studentPlaySports(); //this is an abstract method
	
	public void studentHallBooking() {
		System.out.println("this is a normal student method");
	}

}
