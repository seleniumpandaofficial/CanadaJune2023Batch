package com.day6.java;

public class Program_to_Print_Largest_3_numbers {

	public static void main(String[] args) {
        int a=10, b=20, c=30;
        
        if(a>b && a>c) {
        	System.out.println("a is the greatest :" + a);
        }else if (b>a && b>c) {
        	System.out.println("b is the greatest :" + b);
        }else {
        	System.out.println("c is the greatest : " + c);
        }

	}

}
