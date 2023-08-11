package wait_concepts_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TypesOfWaits {

	//implicitWait - smart wait. Let's say the webelement takes 2-5 seconds to appear. 9 seconds
	//explicitWait
	//fluentWait
	
	public WebDriver driver;
	
	@Test
	public void login() throws Exception {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(200));
		
		driver.get("https://tutorialsninja.com/demo");
		
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
}
