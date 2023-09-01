package com.automation.MultipleWebElements;

import java.io.IOException;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Video4_BBC_TopLinks {

	public WebDriver driver;

	@Test
	public void bbc() throws ClientProtocolException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		List<WebElement> links = driver
				.findElements(By.xpath("//nav[@class = 'orbit-header-links international']/ul/li/a"));

		for (int i = 0; i < links.size(); i++) {
			String url = links.get(i).getAttribute("href");
			System.out.println(links.get(i).getText() + "--->" + links.get(i).isDisplayed() + "--->" + url);
			
			boolean result = validateResponseCode(url);
			Assert.assertTrue(result, "invalid response code");	

			links.get(i).click();
			System.out.println("The title of this webpage is : " + driver.getTitle());
			driver.get("https://bbc.com");
			links = driver.findElements(By.xpath("//nav[@class = 'orbit-header-links international']/ul/li/a"));
		}

	}

	public boolean validateResponseCode(String url) throws ClientProtocolException, IOException {
		int response_code = 0;
		response_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("Response code for the url : " + url + "is :--- > " + response_code);
		if (response_code == 200) {
			return true;
		}
		return false;
	}

}
