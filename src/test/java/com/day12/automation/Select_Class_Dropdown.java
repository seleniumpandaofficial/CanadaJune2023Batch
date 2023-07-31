package com.day12.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_Class_Dropdown {

	public WebDriver driver;
	public Select select;
	
	@Test
	public void createAccountFacebook() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.name("reg_email__")).sendKeys("SeleniumPanda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("SeleniumPanda@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@123");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("9");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1996");
		
	}
}
