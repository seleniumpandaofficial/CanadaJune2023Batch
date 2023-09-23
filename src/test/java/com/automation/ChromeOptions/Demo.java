package com.automation.ChromeOptions;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test(priority=1)
	public void loginTest() {
		ChromeOptions options = new ChromeOptions();
		//to make execution faster
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//maximize the browser from the beginning itself
		//options.addArguments("--start-maximized");
		//options.addArguments("--incognito");
		options.addArguments("--headless=new");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.className("rd_logout")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'You have successfully signed out of Rediffmail.']")).isDisplayed());
		driver.close();
	}
	
	@Test(priority=2)
	public void loginTest1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.className("rd_logout")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'You have successfully signed out of Rediffmail.']")).isDisplayed());
		driver.close();
	}
	
	

}
