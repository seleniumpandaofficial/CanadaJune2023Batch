package com.day7.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations_Simple {
	//getTitle()
	//getCurrentUrl()
	//getPageSource()
	
	//isEnabled(), isDisplayed(), isSelected() - Web Element level

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = "https://www.rediff.com/";
		
		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.className("signin")).click();
		}else {
			driver.quit();
		}
		
		WebElement usernameTextbox = driver.findElement(By.id("login1"));
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		WebElement keepMeSignedInCheckbox = driver.findElement(By.id("remember"));
		WebElement signInButton = driver.findElement(By.className("signinbtn"));
		
		if(usernameTextbox.isEnabled() && passwordTextbox.isDisplayed() && keepMeSignedInCheckbox.isSelected() && signInButton.isDisplayed()) {
			usernameTextbox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextbox.sendKeys("Selenium@123");
			signInButton.click();
			
		} else {
			driver.quit();
		}
		

	}

}
