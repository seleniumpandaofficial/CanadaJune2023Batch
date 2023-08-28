package com.day13.java_ExceptionHandling_in_Java;

public class Concept4_Try_Catch_Block {

	public static void main(String[] args) {
		
		int a = 100, b=0, c;
		try {
			//holds the risky code
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			//holds the handling code
			e.printStackTrace();
			System.out.println("cannot divide by zero");
		} 
		
	}
	
	
	
	//Explanation of this process: -
	
	//Exception occurs at  line no 8. This line is under main() method. The main() method will create an Object
	//This Object will have 3 things: 1. Exception Name
    //                                2. Description
	//                                3. stack trace
	
	//this Object will be passed to JVM. JVM will check if it can handle it. 
	//if JVM cannot handle that object then it will pass that Object to Default Exception Handler
	//but before JVM passes the Object to DEH, it will abnormally terminate the program
	
	//DEH will print the Exception
	
	//in case you manually want to handle the Exception you have to use try catch block

}
