package com.day12.applying_OOPs_TestBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	public TestBase() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\day12\\applying_OOP_Automation\\config.properties");
		System.out.println(System.getProperty("user.dir"));
		prop.load(ip);
	
	}
	
	
	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));
		driver.get("https://tutorialsninja.com/demo");
		return driver;
		
	}

}
