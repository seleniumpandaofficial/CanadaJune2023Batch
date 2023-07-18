package com.day8.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingInstanceVariable {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://google.com");
	}

}
