package com.day12.DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_ToRead_From_Properties_File {
	
	//why we need properties file ?
	//in a browser application there are certain data which is quite fixated.
	
	//all these kind of data are generally stored in a properties file which will not change that frequently.
	
	
	//Steps to follow: -
	//Step 1 - Create a .properties file
	//Step 2 - using the key = value format store the data in the .properties file
	//Step 3 - Create the Object of Properties class
	//Step 4 - Create the Object of FileInputStream Class and pass the path of the .properties file in the constructor
	//Step 5 - Surround the login with try catch block or throws Exception
	//Step 6 - load the file
	public static WebDriver driver;
	public static Properties prop;
	
	public static void main(String[] args) throws Exception {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\day12\\DataDrivenTesting\\config.properties");
		System.out.println(System.getProperty("user.dir"));
		prop.load(ip);
		TNTest();
		
	}
	
	public static void TNTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}

}
