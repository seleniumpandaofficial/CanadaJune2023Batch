package com.automation.WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RediffWebTable {
	//Please find the CurrentPrice(Rs) of a company Sun Retail
	//Please determine the CurrentPrice(Rs) of the company which is present in the 1057th row
	//Print first 5 rows of the webtable with the company name and the other 4 values within it
	//choose 5 companies of your choice and write their respective CurrentPrice(Rs)
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void assignment1() {
		String companyName = "Sun Retail";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		System.out.println("Total number of companies as of this moment is :" + names.size());
		System.out.println("Respective current prices as of this moment is :" + prices.size());
		
		for(int i=0 ; i<names.size() ; i++) {
			if(companyName.equals(names.get(i).getText())) {
			System.out.println(names.get(i).getText() + "------>" + prices.get(i).getText());
			break;
		}
	}
		
	}
	
	@Test(priority=2)
	public void assignment2() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		WebElement companyName = driver.findElement(By.xpath("//table[@class = 'dataTable']/tbody/tr[1057]"));
		
	}
	
	@Test(priority=3)
	public void assignment3() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> first5Rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() >2108 and position() <=2113]"));
		for(int i=0 ; i<first5Rows.size() ; i++) {
			System.out.println(first5Rows.get(i).getText());
		}
	}
	
	@Test(priority=4)
	public void assignment4() {
		String companyName1 = "Sun Retail";
		String companyName2 = "KSB";
		String companyName3 = "Hubtown";
		String companyName4 = "CWD L";
		String companyName5 = "UCAL L";
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		for(int i=0 ; i<names.size() ; i++) {
			if(companyName1.equals(names.get(i).getText()) && companyName2.equals(names.get(i).getText()) && companyName3.equals(names.get(i).getText()) && companyName4.equals(names.get(i).getText()) && companyName5.equals(names.get(i).getText())) {
			System.out.println(names.get(i).getText() + "------>" + prices.get(i).getText());
			break;
		}
		
		}
	}
     
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
