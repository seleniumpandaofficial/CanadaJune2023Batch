package com.day6.java;

public class Day6_While_Loop_HomeWork {

	
		//can you write a program to print first 100 natural numbers using while loop
		//can you write a program to print first 50 even numbers using while loop
		//write a program to print first 50 even numbers using while loop
		//write a program to print reversely from 100 to 1 using while loop
		//write a program to print reversely from 99 till 3 with 3 separations - 99, 96, 93, 90, ......... 3
		//write a program to print first 10 multiples of 5 and add the sum of the multiples
		//write a program to print from 100 till 5 reversely - 100,95,90,......5 and then add the sum of all the reverse multiples and give the value

	
	
	public static void main(String[] args) {
		//can you write a program to print first 100 natural numbers using while loop
		System.out.println("program to print first 100 natural numbers using while loop");
		int i = 0;
		while (i<100)
		{
			i++;
			System.out.print(i + " ");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
				
		//can you write a program to print first 50 even numbers using while loop
		System.out.println("program to print first 50 even numbers using while loop");
		int k=0;
		while (k<=100)
		{
			k++;
			if(k%2==0)
			{
				System.out.println(k);
			}
			
		}
		
		//write a program to print reversely from 100 to 1 using while loop
		System.out.println("program to print reversely from 100 to 1 using while loop");
		int j=100;
		while(j>0)
		{
			System.out.println(j);
			j--;
			
		}
		//write a program to print reversely from 99 till 3 with 3 separations - 99, 96, 93, 90, ......... 3
		System.out.println("program to print reversely from 99 till 3 with 3 separations");
		int l=99;
		while(l>0)
		{
			l=l-3;
			System.out.println(l);
			
		}
		//write a program to print first 10 multiples of 5 and add the sum of the multiples
		System.out.println("program to print first 10 multiples of 5 and add the sum of the multiples");
		int m=5;
		int n=0;
		int sum1= 0;
		while(n<10)
		{
			n++;
			int sum=0;
			sum=m*n;
			sum1=	sum1 + sum;
			System.out.println(sum);	
		}
		System.out.println("sum is " + sum1);
		//write a program to print from 100 till 5 reversely - 100,95,90,......5 and then add the sum of all the reverse multiples and give the value
		
		System.out.println("program to print from 100 till 5 reversely");
		int o=100;
		int p=5;
		int sum2=0;
		while (o>0)
		{
			
			System.out.println(o);
			o=o-p;
			sum2=sum2+o;
		}
		System.out.println("Sum is "+ sum2);	

	}

}


