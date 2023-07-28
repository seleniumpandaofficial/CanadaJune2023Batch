package com.day11.TestNG_Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//rules of @DataProvider
//Rule 1 - returns a 2-D Object array
//Rule 2 - Declare the array, create, initialize Array
//Rule 3 - Whatever Test Case you will create @Test you have to connect with the @DataProvider
//Rule 4 - You have to parameterize the Test Case

public class DataProvider_Concept {

	@DataProvider(name = "TutorialsNinja")
    public Object[][] getTNData() {

		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				            { "seleniumpanda1@gmail.com", "Selenium@123" }, 
				            { "seleniumpanda2@gmail.com", "Selenium@123" } };
        return data;
	}
	
	@DataProvider(name = "Rediff")
    public Object[][] getRediffData() {

		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				            { "seleniumpanda1@rediffmail.com", "Donkey@123" }}; 
				           
        return data;
	}
	
	
	public WebDriver driver;
	@Test(priority=1, dataProvider = "TutorialsNinja")
	public void loginTest(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority=2, dataProvider = "Rediff")
	public void loginRediffTest(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
