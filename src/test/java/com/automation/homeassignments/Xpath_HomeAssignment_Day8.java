package com.automation.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_HomeAssignment_Day8 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		//Rediffmail
		//Money
		//Business Email
		//Videos
		//Shopping
		//Create Account
		
		//I want 10 advanced Customized xpaths of all the above Web Elements
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		//driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.cssSelector("aside#column-right > div > a:nth-child(13)")).click();

	}

}
