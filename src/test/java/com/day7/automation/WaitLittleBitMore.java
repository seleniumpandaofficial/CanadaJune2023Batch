package com.day7.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitLittleBitMore {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		Thread.sleep(2000);
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("rd_logout")).click();
		

	}

}
