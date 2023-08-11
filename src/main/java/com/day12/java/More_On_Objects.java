package com.day12.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class More_On_Objects {
	//new keyword to basically to create an Object

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//WebDriver is an interface
		//what is the driver - reference
		//new - is a keyword to create an Object
		//new ChromeDriver() - this is the Object
		//ChromeDriver is the name of the implementing Class
		//ChromeDriver() - this is the constructor
		
		//What are the steps that we need to write to understand the concept of Object
		//Step 1 - Declaration
		
		//Step 2 - Instantiation
		
		//Step 3 - Initialization
		
		driver.manage().window().maximize();
		driver.get("https://google.com");

	}

}

class Animal {
	
	//Step 1 - Declaration
	Animal Romeo; //this is called Declaration
	              //Animal is the Class Name, Romeo is name of the Dog or Object
	
	//Step 2 - Instantiation
	//this is when memory is allocated for an object
	//we know new keyword is used to create the object
	//a reference to the object that was created is returned from the new keyword
	
	//Romeo = new
			
	//Step 3 - Initialization
	//new keyword is followed by a call to a constructor. This call initializes the new Object
	
	
}
