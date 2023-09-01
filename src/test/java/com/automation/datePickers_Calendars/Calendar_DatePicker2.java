package com.automation.datePickers_Calendars;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calendar_DatePicker2 {
	public WebDriver driver;

	@Test
	public void datePickerType1() {
		customizeDate("31", "January", "2031");
	}

	public void customizeDate(String selectDay, String selectMonth, String selectYear) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));

		// need to check for invalid date - month cannot more than 31 days
		// february cannot have more than 29 days
		if (Integer.parseInt(selectDay) > 31) {
			System.out.println("invalid date");
			return;
		}

		if (selectMonth.equals("February") && Integer.parseInt(selectDay) > 29) {
			System.out.println("invalid Feb month date");
			return;
		}

		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);

		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals(selectMonth) && year.equals(selectYear))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}

		String xpathDayText = "//td[@data-handler = 'selectDay']/a[text() = \'" + selectDay + "\']";

		try {
			driver.findElement(By.xpath(xpathDayText)).click();
		} catch (Exception e) {
			System.out.println("Invalid Date");
		}
	}

}
