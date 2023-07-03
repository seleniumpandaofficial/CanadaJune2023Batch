package com.day4.java;

public class Inc_Dec_Program {

	public static void main(String[] args) {
		int i = 1; //latest value of i is 1
		
		int j = i-- - --i;
		// j  = 1   - -1
		// i  = 0, -1 
		
		System.out.println("the value of j at row number 8 is : " + j); //2
		System.out.println("the value of i at row number 8 is : " + i); // -1
		
		int k = i++ + i++ - j-- - ++j;
		//  k = -1  + 0   - 2   - 2 = -5
		//  i =  0,   1                1
		//  j =             1,      2  = 2          
	  
		
		System.out.println(i);  
		System.out.println(j); 
		System.out.println(k);  

	}

}
