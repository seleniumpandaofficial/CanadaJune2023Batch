package com.day13.java_ScannerClass;

import java.util.Scanner;

public class ScannerDemo { //mostly used to get user input

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scan.next();
		
		System.out.println("Enter your gender");
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter age");
		int age = scan.nextInt();
		
		System.out.println("Enter phoneNumber");
		int phone = scan.nextInt();
		
		
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("PhoneNumber: " + phone);

	}

}
