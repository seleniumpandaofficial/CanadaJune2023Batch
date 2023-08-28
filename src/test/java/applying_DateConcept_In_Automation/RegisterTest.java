package applying_DateConcept_In_Automation;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RegisterTest {
	public WebDriver driver;
	
	@Test(priority=1, invocationCount = 5)
	public void verifyRegisterTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(RegisterTest.customizeEmailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("label.radio-inline:nth-child(1) > input")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")).isDisplayed());
		
	}
	
	public static String customizeEmailWithDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda" + timeStamp + "@gmail.com";
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
