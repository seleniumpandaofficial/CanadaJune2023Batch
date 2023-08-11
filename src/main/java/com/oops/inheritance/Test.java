package com.oops.inheritance;

public class Test {

	public static void main(String[] args) {
		Child child = new Child();
		child.superBike();
		child.superBike();
		child.bankBalance();
		child.farmHouse();
		child.haveli();
		
		Parent parent = new Parent();
		parent.bankBalance();
		parent.farmHouse();
		parent.haveli();
		

	}

}
