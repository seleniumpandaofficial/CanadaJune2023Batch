package com.day6.java;

public class Program_To_Determine_Number_is_Even_or_Odd {

	public static void main(String[] args) {
		int i = 21;
		int j = 22;
		
		if(i%2 == 0 && j%2 ==0) {
			System.out.println("both i and j are even");
		} else if(i%2 ==0 && j%2 != 0) {
			System.out.println("i is even :" + i);
			System.out.println("j is odd :" + j);
		} else if(i%2 !=0 && j%2 == 0) {
			System.out.println("i is odd :" + i);
			System.out.println("j is even :" + j);
		} else {
			System.out.println("Neither of the numbers are even");
		}

	}

}
