package com.day13.java_ScannerClass;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 = scan.nextInt();
		
		System.out.println("Enter the second number");
		int number2 = scan.nextInt();
		
		
		System.out.println("Select the symbol (+, -, *, /)");
		String symbol = scan.next();

		int result;
		
		switch(symbol) {
		case "+" : result = number1 + number2; 
		System.out.println(result);
		break;
		
		case "-" : result = number1 - number2;
		System.out.println(result);
		break;
		
		case "*" : result = number1 * number2;
		System.out.println(result);
		break;
		
		case "/" : result = number1/number2;
		System.out.println(result);
		break;
		
		default: System.out.println("invalid symbol");
		break;
		}
	}

}
