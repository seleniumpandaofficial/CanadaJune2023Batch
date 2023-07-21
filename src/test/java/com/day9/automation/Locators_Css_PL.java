package com.day9.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Css_PL {
	
	
	public static WebDriver driver;

	public static void main(String[] args) {
		/*
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://rediff.com");
		 * driver.findElement(By.partialLinkText("Business Em")).click();
		 */
		
		//complete text of the link = Business Email	
		//cssSelectorKnowledge();
		TNRegister_Css();
	}
	
	public static void cssSelectorKnowledge() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[class = signin]")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
	}
	
	public static void TNRegister_Css() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda2345@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("label.radio-inline:nth-child(1) > input")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
