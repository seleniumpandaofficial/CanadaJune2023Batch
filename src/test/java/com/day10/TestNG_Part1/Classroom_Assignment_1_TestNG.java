package com.day10.TestNG_Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Classroom_Assignment_1_TestNG {
	
	//@BeforeMethod
	//@Test
	//@Test
	//@Test
	//AfterMethod
	
	//seleniumpanda@rediffmail.com   Selenium@123
	//seleniumpanda1@rediffmail.com  Donkey@123
	//chowdhurygs@rediffmail.com     Shajlee1@
	
	public WebDriver driver;
	
	@BeforeMethod
	public void loginRediff() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority=1)
	public void loginTest1() throws Exception {
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Test(priority=2)
	public void loginTest2() throws Exception {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Test(priority=3)
	public void loginTest3() throws Exception {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda2@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
