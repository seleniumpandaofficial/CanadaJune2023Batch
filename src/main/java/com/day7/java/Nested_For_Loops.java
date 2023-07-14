package com.day7.java;

public class Nested_For_Loops {
	
	//for loop inside a for loop - there is an outer loop and there is inner loop
	//for 1 iteration of outer for loop, inner for loop executes multiple not of times as specified
	//outer for loop represents row
	//inner for loop represents col

	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) {
			
			for (int j=1 ; j<=5 ; j++) {
				System.out.println(" i = " + i + ", j = " + j);
			}
			
			System.out.println("for every iteration of outer for loop or i : " + i);
		}
		

	}

}
