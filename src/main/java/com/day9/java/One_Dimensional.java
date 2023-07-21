package com.day9.java;

public class One_Dimensional {
	// Declare an Array
	// Create an Array
	// Initialize an Array
	// Retrieve the values of an Array

	public static void main(String[] args) {
		
		//declare a 1-D array
		
		//int[] a; //the most popular representation 
		int b[];
		int []c;
		int[]d; 
		
		int[] x,y; //x is 1-D, y is also 1-D array
		int m[], n; //m is 1-D, n is simply an int type variable
		int[]p, q; // p and q are both 1-d int arrays
		
		//creating an 1-D array
		
		int[] l = new int[3];
		//what is the length of the l array
		System.out.println(l.length);
		
		int[] v = new int[0];
		System.out.println(v.length);
		
		int[] e = new int[-3];
		System.out.println(e.length);
		
		//initialize an array
		
		int[] a = new int[5];
		//length of a is 5
		//index positions are - 0,1,2,3,4
		
		a[0] = 11;
		a[1] = 21;
		a[2] = 31;
		a[3] = 41;
		a[4] = 51;
		
		
		//declaration + Creation + initialization = together
	//	int[] a = {11, 21, 31, 41, 51};
	//	int[] a = new int[] {11,21,31,41,51};

	}

}
