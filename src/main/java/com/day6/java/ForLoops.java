package com.day6.java;

public class ForLoops {

	public static void main(String[] args) {

		// for(initialization ; condition ; updation) {
		// logic
		// }

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		// print first 20 natural numbers and print the sum of it all using for loop

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
			sum = sum + i; // 0 + 1
			System.out.println("the total sum is : " + sum);
		}
		System.out.println();
		System.out.println("the total sum is : " + sum);

		
		//using for loop for infinity
		
		for (int i = 1; i >= 1; i++) {
			System.out.println(i);
			//print 1
			//print 2
			//print 3
			//print 4
		}

	}

}
