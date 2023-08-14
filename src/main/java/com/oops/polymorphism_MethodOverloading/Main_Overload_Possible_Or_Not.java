package com.oops.polymorphism_MethodOverloading;

public class Main_Overload_Possible_Or_Not {

	public static void main(String[] args) {
		System.out.println("This is the actual main method");
        main(10);
        main(args = new String[3], args = new String[4]);
	}
	
	public static void main(int i) {
		System.out.println("This is overloaded main method with an int type parameter");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is multiple parameters String Array main method");
	}

}
