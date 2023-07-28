package com.day11.TestNG_Part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Batch_Class_3 {

public WebDriver driver;
	
	@BeforeMethod
	public void openChrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void openRediff() {	
		driver.get("https://rediff.com");
	
	}
	
	@Test(priority = 2)
	public void openTN() {
		
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
