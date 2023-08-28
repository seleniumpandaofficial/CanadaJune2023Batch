package com.day13.java_ExceptionHandling_in_Java;

public class Concept6_Finally_Block {
	//finally block will execute. No matter exception occurs or not

	public static void main(String[] args) {
		
		try {
			int a=100, b=0, c;
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("This is finally block");
		}
		

	}

}
