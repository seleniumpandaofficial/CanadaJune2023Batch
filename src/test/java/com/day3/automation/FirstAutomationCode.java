package com.day3.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomationCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();  //Ctrl + Shift + O    ,  command+Shift+O
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://costco.com");
		
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.get("https://tutorialsninja.com/demo");
		
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.manage().deleteAllCookies();
		driver2.get("https://rediff.com");
		
		

	}

}
