package com.day5.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_In_A_WebPage {
	// what is a Web Element ?
	// in a Webpage anything you see that has a function is called WebElement

	// button - it has a role. It gets clicked
	// textbox - editable
	// radiobutton - gets Selected
	// links
	// dropdowns
	// simple text
	// checkboxes
	// labels
	// images
	// web table
	// bootstrap dropdown
	// calendars
	// frames
	// alerts or popups
	// hamburger button
	// flash
	// barcode
	// captchas

	// intention of learning Automation - you should be able to handle all the above
	// web elements and more

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		
	}

}
