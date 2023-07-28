package com.day11.TestNG_Part2;

import org.testng.annotations.DataProvider;

public class DataProviders_SeparateClass {
	
	@DataProvider(name = "TutorialsNinja")
    public Object[][] getTNData() {

		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				            { "seleniumpanda1@gmail.com", "Selenium@123" }, 
				            { "seleniumpanda2@gmail.com", "Selenium@123" } };
        return data;
	}
	
	@DataProvider(name = "Rediff")
    public Object[][] getRediffData() {

		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				            { "seleniumpanda1@rediffmail.com", "Donkey@123" }}; 
				           
        return data;
	}

}
