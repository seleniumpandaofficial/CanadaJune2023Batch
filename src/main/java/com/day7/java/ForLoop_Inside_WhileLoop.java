package com.day7.java;

public class ForLoop_Inside_WhileLoop {

	public static void main(String[] args) {
	
		int i  = 1;
		while(i <=5) {
			
			for(int j=1 ; j<=5 ; j++) {
				System.out.println("i = " + i + ", : j = " + j );
			}
			
			i = i+1;
			System.out.println();
		}

	}

}
