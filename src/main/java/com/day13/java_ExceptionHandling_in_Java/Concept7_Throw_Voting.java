package com.day13.java_ExceptionHandling_in_Java;

import java.util.Scanner;

public class Concept7_Throw_Voting {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter age: ");
   
    try {
    int age = scan.nextInt();
   if(age < 18) {
    	throw new Concept7_AgeLimitException("Not eligible for voting"); 	
    }else {
    	System.out.println("Eligible for voting");
    }
    
    System.out.println("Voting process is ON");

	} catch (Exception e) {
		e.printStackTrace();
	}
    
    System.out.println("Voting age exception has been handled if this line is getting printed");
	}
}


