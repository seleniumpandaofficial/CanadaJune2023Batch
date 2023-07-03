package com.day4.java;

public class Concatenation { //means joining and it is represented by the + symbol

	public static void main(String[] args) {
		int i = 20;
		int j = 30;
		String S1 = "Romeo";
		String S2 = "Juliet";
		
		System.out.println(i + j);
		System.out.println(i + j + S1);
		System.out.println(i + j + S1 + S2);
		System.out.println(S1 + S2 + i + j);
		System.out.println(S1 + S2 + (i + j));
		System.out.println((S1 + S2) + i + j);
		System.out.println((S1 + S2) + (i + j));

	}

}
