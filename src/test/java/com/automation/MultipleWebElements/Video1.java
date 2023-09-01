package com.automation.MultipleWebElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video1 {
	
	public WebDriver driver;
	
	@Test
	public void multipleWebElements() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		//Give me total number of links present in bbc.com page right at this moment
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links in bbc.com homepage at this moment :" + links.size());
		
		//you want to select a particular link
		//1st link will be in 0th position
		//285th link will be in 284th position
		
		//you want to determine the 101st
		WebElement LinkNo101 = links.get(100);
		//you want to print the text of this link
		System.out.println("The text of Link 101 is :" + LinkNo101.getText());
		//what is the url for Link101
		System.out.println(LinkNo101.getAttribute("href"));
        //what is the x and y coordinate of that Link101
		System.out.println(LinkNo101.getLocation().x + "---->" + LinkNo101.getLocation().y);
		//want to click on Link101
		//LinkNo101.click();
		//System.out.println("Title of Link101 at this moment is : " + driver.getTitle());
		
		//Let us print names of all the links
		for(int i=0 ; i<links.size() ; i++) {
			WebElement totalLinks = links.get(i);
			System.out.println(totalLinks.getText() + "---->" + totalLinks.isDisplayed());
		}
		
	}

}
