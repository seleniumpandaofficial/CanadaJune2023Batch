package com.day8.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Xpath_ClassAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class = 'new_container']/descendant::b[1]")).click();
	}

}
