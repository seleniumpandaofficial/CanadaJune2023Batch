package com.oops.abstraction_Interface;

public interface Introduction {
	
	public abstract void display();
	public void display1();
	void display2();
	
	int i = 10; //public, static and final in nature - variables
	public static final int j = 10;
	public static final String name = "John";

	//after jdk 8 , default concrete methods were allowed in interface
	
	default void check() {
		
	}
	
	//public static methods have been allowed in interface from jdk 8 
	
	public static void testWorld() {
		
	}
	
	//private methods have been allowed from jdk 9
	
	private static void secret() {
		
	}
    

}
