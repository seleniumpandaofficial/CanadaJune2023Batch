package com.day10.TestNG_Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Applying_Test_Annotations {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void serverLevelVerifications() {
		System.out.println("Server is fine");
	}
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	
	}
	
	@Test(priority = 1)
	public void loginTest() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
	}
	
	@Test(priority = 2)
	public void registerTest() {

		String expectedRegisterPageTitle = "Register Account";
		String actualRegisterPageTitle = driver.getTitle();
		
		String expectedRegisterPageCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/register";
		String actualRegisterPageCurrentUrl = driver.getCurrentUrl();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
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
			emailTextbox.sendKeys("seleniumpanda9019019@gmail.com");
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
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
