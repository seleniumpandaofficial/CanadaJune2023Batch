package com.day6.java;

public class Program_To_Determine_LeapYear {

//	1. It is evenly divisible by 100
//	2. If it is divisible by 100, then it should also be divisible by 400
//	3. Except this, all other years evenly divisible by 4 are leap years

	public static void main(String[] args) {
		int year1 = 2000;
		int year2 = 1998;
		int year3 = 1700;
		int year4 = 2016;

		if (((year1 % 4 == 0) && (year1 % 100 != 0)) || (year1 % 400 == 0)) {
			System.out.println("Specified year is a leap year: " + year1);
		} else {
			System.out.println("Specified year is not a leap year:" + year1);
		}

		if (((year2 % 4 == 0) && (year2 % 100 != 0)) || (year2 % 400 == 0)) {
			System.out.println("Specified year is a leap year: " + year2);
		} else {
			System.out.println("Specified year is not a leap year:" + year2);
		}

		if (((year3 % 4 == 0) && (year3 % 100 != 0)) || (year3 % 400 == 0)) {
			System.out.println("Specified year is a leap year: " + year3);
		} else {
			System.out.println("Specified year is not a leap year:" + year3);
		}

		if (((year4 % 4 == 0) && (year4 % 100 != 0)) || (year4 % 400 == 0)) {
			System.out.println("Specified year is a leap year: " + year4);
		} else {
			System.out.println("Specified year is not a leap year:" + year4);
		}

		
		
		
		if (year2 % 4 == 0) {
			System.out.println("it is a leap year:" + year2);
		} else {
			System.out.println("it is not a leap year:" + year2);
		}

		if (year1 % 100 == 0 && year1 % 400 == 0) {
			System.out.println("it is a leap year:" + year1);
		} else {
			System.out.println("it is not a leap year:" + year1);
		}
	}

}
