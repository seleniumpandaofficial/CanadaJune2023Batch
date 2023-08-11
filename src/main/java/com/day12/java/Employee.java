package com.day12.java;

public class Employee {
	String name; //null
	int age; //0
	
	//a constructor is automatically invoked when an Object is created
	
	public Employee() {
		System.out.println("This is a constructor with no parameter");
	}
	
	public Employee(String n, int a) {
		name = n;
		age = a;
	}
	
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();	 //This is a constructor with no parameter
		System.out.println(emp1.name);   //null
		System.out.println(emp1.age);    //0
		
		
		Employee emp2 = new Employee(); //This is a constructor with no parameter
	
		
		Employee emp3 = new Employee(); //This is a constructor with no parameter
		
		Employee emp4 = new Employee("Tom" , 30);
		System.out.println(emp4.name + " " + emp4.age);
	}

}
