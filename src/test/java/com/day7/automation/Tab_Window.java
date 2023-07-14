package com.day7.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_Window {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		//amazon.com
		driver.switchTo().newWindow(WindowType.TAB); //Ctrl + Shift + O
		driver.get("https://amazon.com");
		//you want to open flipkart in another window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://flipkart.com");
		
		
		

	}

}
