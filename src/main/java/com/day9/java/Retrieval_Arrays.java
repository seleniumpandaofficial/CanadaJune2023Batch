package com.day9.java;

public class Retrieval_Arrays {
	
	//Empty - there are no elements in the array
	//Indians - Canada [convert $ to INR]

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		/*
		 * int[] a1 = null;
		 * 
		 * System.out.println(a1.length);
		 */

		String[] S = { "Java", "C++", ".Net", "Python", "Ruby", "Perl", "PHP", "Javascript" };

		// retrieve all the elements of array a

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//Please retrieve a specific element ?
		
		System.out.println("The 10th element of array a is : " + a[9]);

	}

}
