package com.day11.TestNG_Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_TestCases_Using_TestNGxmlfile {
	public WebDriver driver;

	@Test
	@Parameters({"Browser", "url", "username", "password"})
	public void rediffLogin(@Optional("Chrome") String Browser,@Optional("https://rediff.com") String url, @Optional("seleniumpanda@rediffmail.com") String username,@Optional("Selenium@123") String password) {
		if(Browser.equals("Chrome")) {
		driver = new ChromeDriver();
		}
		else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();

	}

}
