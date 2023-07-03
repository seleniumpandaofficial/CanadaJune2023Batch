package com.day4.java;

public class Day_Homework {

	public static void main(String[] args) {
		int i = 10;
		int j = --i - i++;
		int k = i-- - --i + i++ - --j;
		int l = i++ + j++ + --j - --k - --i;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
