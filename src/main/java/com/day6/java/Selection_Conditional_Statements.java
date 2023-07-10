package com.day6.java;

public class Selection_Conditional_Statements {
	//Selection statements allow us to control the flow of program execution on the basis of the outcome of an expression(the condition)

	//if, if-else, if-else-if, nested if, switch
	public static void main(String[] args) {
	
       //if statement
		

		/*
		 * if(true != false) { System.out.println("the sun rises in the east"); }
		 */
          
		/*
		 * if(2>3) { System.out.println("This statement is correct"); }else {
		 * System.out.println("this statement is incorrect"); }
		 */
		
		if (2<1) {
			System.out.println("This is not right");
		}else if (2>3) {
			System.out.println("This looks right");
		}else if (2 != 2) {
			System.out.println("this may look right");
		}else {
			System.out.println("None of the above is right");
		}
	}

}
