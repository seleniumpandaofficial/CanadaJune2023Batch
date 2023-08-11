package com.day12.java;

public class Constructors_vs_Methods {
	//Constructor has to have the name of the Class but methods can have any names
	//constructors cannot have a return type, methods have to have a return type
	//constructors cannot be over-ridden only overloaded but methods can have both
	//constructors are invoked the moment an Object is created but not methods
	//constructors have a default type the moment an object is created which could be invisible but not methods
	//constructors cannot be made static but methods can be static

	public static void testLogic() {

	}

	public void testLogic1() {

	}
	
	
	public Constructors_vs_Methods() {
	  System.out.println("This is a non parameterized user defined constructor"); 
	  
	  }
	 
	
	public static void main(String[] args) {
		Constructors_vs_Methods ref = new Constructors_vs_Methods();
	}

}
