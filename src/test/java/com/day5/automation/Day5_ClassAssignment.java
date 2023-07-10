package com.day5.automation;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5_ClassAssignment {

	public static void main(String[] args) {
		// I want you to create a Class
		// open 4 different websites for each browser
		// Website1, Website2, Website3, Website4 - Chrome
		// 5,6,7,8 - Firefox
		// 9,10,11,12 - Edge

		WebDriver driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		  
		  driver.get("https://rediff.com"); // Website1 driver.quit();
		  driver.get("https://amazon.com");
		  driver.get("https://flipkart.com");
		  driver.get("https://makemytrip.com");
		  
		  driver.quit();
		  
		  openInfirefox();
		  openInedge();

	}
	
	public static void openInfirefox() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://costco.com");
		driver.get("https://easemytrip.com");
		driver.get("https://google.com");
		driver.get("https://skyscanner.com");
		driver.quit();
	}

	public static void openInedge() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://amazon.com");
		driver.get("https://amazon.com");
		driver.get("https://amazon.com");
		driver.get("https://amazon.com");
		driver.quit();
	}

}
