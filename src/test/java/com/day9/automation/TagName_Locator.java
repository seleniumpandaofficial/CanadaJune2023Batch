package com.day9.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locator {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//tagname locator is used when there are multiple web element
		
		List<WebElement> allInputTags = driver.findElements(By.tagName("input"));
		System.out.println(allInputTags.size());
		
		

	}

}
