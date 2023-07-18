package com.day8.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationAssignment_BetterForm_Day7 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
        
		LoginValidation();
		RegisterValidation();

	}

	public static void LoginValidation() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		

	}

	public static void RegisterValidation() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		String expectedRegisterPageTitle = "Register Account";
		String actualRegisterPageTitle = driver.getTitle();
		
		String expectedRegisterPageCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/register";
		String actualRegisterPageCurrentUrl = driver.getCurrentUrl();
		
		WebElement firstNameTextbox = driver.findElement(By.id("input-firstname"));
		WebElement lastNameTextbox = driver.findElement(By.id("input-lastname"));
		WebElement emailTextbox = driver.findElement(By.id("input-email"));
		WebElement telephoneTextbox = driver.findElement(By.id("input-telephone"));
		WebElement passwordTextbox = driver.findElement(By.id("input-password"));
		WebElement confirmPasswordTextbox = driver.findElement(By.id("input-confirm"));
		WebElement newsLetterRadioButton = driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']"));
		WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
		WebElement continueButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		if(expectedRegisterPageTitle.equals(actualRegisterPageTitle) && expectedRegisterPageCurrentUrl.equals(actualRegisterPageCurrentUrl)) {
			firstNameTextbox.sendKeys("Selenium");
			lastNameTextbox.sendKeys("Panda");
			emailTextbox.sendKeys("seleniumpanda901901@gmail.com");
			telephoneTextbox.sendKeys("9876543210");
			passwordTextbox.sendKeys("Selenium@123");
			confirmPasswordTextbox.sendKeys("Selenium@123");
			newsLetterRadioButton.click();
			privacyPolicyCheckbox.click();
			continueButton.click();
			System.out.println("TEST CASE PASS");
			
		}else {
			System.out.println("TEST CASE FAIL");
		}
		
		//driver.quit();
		
	}

}
