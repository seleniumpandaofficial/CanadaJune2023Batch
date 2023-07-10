package com.day6.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_More_Understanding {
	
	//locators help you to locate that particular Web Element and connect with it
	//there are 16 locators in Selenium4
	//8 are there since beginning
	//3 very few people use
	//5 are new to Selenium 4
	
	//id, class, name, linkText, partialLinkText, tagname, xpath, cssSelector
	//not every webelement will cater to these locators
	//we have to verify which webelement can cater to what locator

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com");
		
		//let's pick up a WebElement first
		//Sign in webelement has an attribute class = signin
		
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
		driver.findElement(By.linkText("Rediff Home")).click();
		
		
		//seleniumpanda@gmail.com   Selenium@123
		//seleniumpanda1@gmail.com
		//seleniumpanda2@gmail.com
		//.
		//.
		//seleniumpanda15@gmail.com
		

	}

}
