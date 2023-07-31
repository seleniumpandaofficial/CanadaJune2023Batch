package com.day12.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_PopUps {
	
	public WebDriver driver;
	
	@Test
	public void handlingAlerts() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.dismiss();
		alert.accept();
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	}

}
