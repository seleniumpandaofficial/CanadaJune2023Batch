package com.day13.TestNG_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Hard_Soft_Registration_TN {

	public WebDriver driver;

	public SoftAssert softassert = new SoftAssert();

	@Test(priority=1)
	public void verifyRegisterTestByFillingAllDetails() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda234502789@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("label.radio-inline:nth-child(1) > input")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		softassert.assertTrue(driver
				.findElement(By.xpath(
						"//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]"))
				.isDisplayed());
		softassert.assertAll();

	}

	@Test(priority=2)
	public void verifyRegisterTestWithoutFillingAnyDetails() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualPrivacyPolicyWarningMessage = driver
				.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";
		Assert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage));

		String actualFirstNameWarningMessage = driver
				.findElement(By.xpath("//input[@id = 'input-firstname']/following-sibling::div")).getText();
		String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";
		Assert.assertTrue(actualFirstNameWarningMessage.contains(expectedFirstNameWarningMessage));

		String actualLastNameWarningMessage = driver
				.findElement(By.xpath("//input[@id = 'input-lastname']/following-sibling::div")).getText();
		String expectedLastNameWarningMessage = "Last Name must be between 1 and 32 characters!";
		Assert.assertTrue(actualLastNameWarningMessage.contains(expectedLastNameWarningMessage));

		String actualEmailWarningMessage = driver
				.findElement(By.xpath("//input[@id = 'input-email']/following-sibling::div")).getText();
		String expectedEmailWarningMessage = "E-Mail Address does not appear to be valid!";
		Assert.assertTrue(actualEmailWarningMessage.contains(expectedEmailWarningMessage));

		String actualTelephoneWarningMessage = driver
				.findElement(By.xpath("//input[@id = 'input-telephone']/following-sibling::div")).getText();
		String expectedTelehoneWarningMessage = "Telephone must be between 3 and 32 characters!";
		Assert.assertTrue(actualTelephoneWarningMessage.contains(expectedTelehoneWarningMessage));

		String actualPasswordWarningMessage = driver
				.findElement(By.xpath("//input[@id = 'input-password']/following-sibling::div")).getText();
		String expectedPasswordWarningMessage = "Password must be between 4 and 20 characters!";
		Assert.assertTrue(actualPasswordWarningMessage.contains(expectedPasswordWarningMessage));

	}

}
