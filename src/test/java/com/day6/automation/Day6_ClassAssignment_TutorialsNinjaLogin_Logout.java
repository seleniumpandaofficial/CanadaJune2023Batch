package com.day6.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_ClassAssignment_TutorialsNinjaLogin_Logout {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		// driver.findElement(By.className("btn btn-primary")).click();    - this is a compound class
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
	}

}
