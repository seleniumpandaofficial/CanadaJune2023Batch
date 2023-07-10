package com.day5.automation;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Understanding_Architecture_With_Code {
	
	//eclipse or IntelliJ IDEA you are writing your java code or whichever code that helps you in Automation - Client
	
	//Whatever you see in browsers is nothing but the UI - User interface
	
	//whatever code you are writing and its conversion into bytecode becomes the machine language and this language is interactable with the drivers of the browsers

	

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		//WebDriver is the interface
		//driver is the reference
		//ChromeDriver is the class
		//new ChromeDriver() is the object of the class
		
		//The WebDriver interface's reference driver is pointing to the object of ChromeDriver class
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://rediff.com");
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
		driver.quit();
	}

	public static void openInedge() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://amazon.com");
		driver.quit();
	}
}
