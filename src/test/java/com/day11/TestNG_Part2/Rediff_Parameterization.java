package com.day11.TestNG_Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//browser
//url
//username
//password

public class Rediff_Parameterization {
	public WebDriver driver;
	
	@Test
	@Parameters({"browser", "url", "username", "password"})
	public void rediffParameterizationTest(String browser, String url, String username, String password) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();	
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("edge")){
			driver = new EdgeDriver();
		}else {
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();
		
		
	}

}
