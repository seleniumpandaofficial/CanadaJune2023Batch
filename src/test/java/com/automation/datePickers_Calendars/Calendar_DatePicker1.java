package com.automation.datePickers_Calendars;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calendar_DatePicker1 {
	
	public WebDriver driver;
	
	
	@Test
	public void datePickerType1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);
		
		//August 2023
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		//&& means - part 1 or part 2 either of them wrong - total is wrong, both wrong - then wrong, both right - then right
		
		while(!(month.equals("January") && year.equals("2025"))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		
		driver.findElement(By.xpath("//td[@data-handler = 'selectDay']/a[text() = '18']")).click();
		
	}

}
