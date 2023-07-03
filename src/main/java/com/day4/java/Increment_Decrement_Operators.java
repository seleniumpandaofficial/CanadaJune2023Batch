package com.day4.java;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {
		//++ and --
		//post increment that is after the variable
		//pre increment that is before the variable
		
		int i = 1; //latest value of i is 1
		int k = i++; //k found i and k got its numerical value = 1, so latest value of k is 1
		// i cannot escape the fact that a ++ operator is associated with its own body. So it has no choice but to increment itself
		//so latest value of i will become 2
		
		
		//int k = i++ - --i + i-- - ++i + --i - i++;
		
		System.out.println(k);
        System.out.println(i);
        
        int j = ++i; //j = 1 + 2 = 3
        //i which was 2 will become 3
        
        System.out.println(j);
        System.out.println(i);
        
        
	}

}
