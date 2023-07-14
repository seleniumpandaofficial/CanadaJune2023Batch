package com.day6.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_CreateAccount {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("seleniumpanda@gmail.com");
		
	}

}
