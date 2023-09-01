package com.automation.MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video3_ClickingSimultaneouslyOnManyLinks {
	//open rediff.com
	//click on one of the links
	//come back to rediff.com home page again
	//click on the next link
	
	public WebDriver driver;
	
	@Test
	public void rediffBottomLinks() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		List<WebElement> rediffBottomLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
		
	for(int i=0 ; i<rediffBottomLinks.size() ; i++) {
		String url = rediffBottomLinks.get(i).getAttribute("href");
		System.out.println(rediffBottomLinks.get(i).getText() + "--->" + url);
		
		rediffBottomLinks.get(i).click();
		System.out.println("The title of this webpage is: " + driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(1000);
		rediffBottomLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
		Thread.sleep(1000);
	}
		
	}

}
