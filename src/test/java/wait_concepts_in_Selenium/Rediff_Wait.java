package wait_concepts_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Wait {
	
	public WebDriver driver;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
	}
	
	@Test
	public void clickOnSignInLink() {
		WebElement signInLink = driver.findElement(By.className("signin"));
		wait.until(ExpectedConditions.elementToBeClickable(signInLink)).click();
		
		WebElement usernameTextbox = driver.findElement(By.id("login1"));
		wait.until(ExpectedConditions.elementToBeClickable(usernameTextbox)).sendKeys("seleniumpanda@rediffmail.com");
		
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		wait.until(ExpectedConditions.elementToBeClickable(passwordTextbox)).sendKeys("Selenium@123");
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
