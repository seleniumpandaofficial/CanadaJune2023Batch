package com.TestNG_Retry_Failed_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Way1 {
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void verifyLoginTestWithValidCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://tutorialsninja.com/demo");
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test(priority=2, retryAnalyzer = MyRetry.class)
	public void verifyLoginTestWithInvalidCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://tutorialsninja.com/demo");
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("seleniumpandaa@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

}
