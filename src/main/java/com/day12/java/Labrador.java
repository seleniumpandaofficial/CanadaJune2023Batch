package com.day12.java;

public class Labrador {
	
public static void main(String[] args) {
	//Step 1 - Declaration + Step 2 - Instantiation + Step 3 - Initialization
			
		Labrador Romeo = new Labrador();
		
//Behavior [Barking / Sleeping / Drinking / Eating / Guarding]
		
		//reference is used to call the behavior
		Romeo.barking();
		Romeo.sleeping();
	}

public void barking() {
	System.out.println("Romeo barks");
}

public void sleeping() {
	System.out.println("Romeo sleeps");
}



}
