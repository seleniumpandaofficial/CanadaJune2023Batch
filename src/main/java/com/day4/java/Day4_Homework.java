package com.day4.java;

public class Day4_Homework {

	public static void main(String[] args) {
		int i = 10; // i = 10
		
		int j = --i - i++;
		//  j = 9   -  9 = 0
		//  i = 9  ,   10
		
		// latest value of i is 10 and j is 0
		
		
		
		int k = i-- - --i + i++ - --j;
		//  k = 10  - 8   + 8   - (-1) = 11
		// i  =  9, 8,      9
		// j = -1
		
		/*
		 * System.out.println(i); //9 System.out.println(j); // -1
		 * System.out.println(k); // 11
		 */	
		
		int l = i++ + j++  +  --j - --k - --i;
		 // l = 9   + (-1) + (-1) - 10  - 9  = -12
		 // i = 10,                       9  = 9
		//  j =        0,    -1,             = -1
		//  k =                      10      = 10               
		
		System.out.println(i); //9
		System.out.println(j); // -1
		System.out.println(k); // 10
		System.out.println(l); // -12
		

	}

}
