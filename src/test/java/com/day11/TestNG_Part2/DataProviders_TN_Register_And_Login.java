package com.day11.TestNG_Part2;

import org.testng.annotations.DataProvider;

public class DataProviders_TN_Register_And_Login {
	
	@DataProvider(name = "TutorialsNinjaRegister")
    public Object[][] getTNRegisterData() {

		Object[][] data = { { "Selenium", "Panda", "seleniumpanda4567@gmail.com" , "123456789", "Selenium@123", "Selenium@123"},
				            { "Selenium", "Panda", "seleniumpanda45678@gmail.com" , "123456789", "Selenium@123", "Selenium@123"}, 
				            { "Selenium", "Panda", "seleniumpanda456789@gmail.com" , "123456789", "Selenium@123", "Selenium@123"}};
        return data;
	}
	
	@DataProvider(name = "TutorialsNinjaLogin")
    public Object[][] getTNLoginData() {

		Object[][] data = { { "seleniumpanda4567@gmail.com", "Selenium@123" },
				            { "seleniumpanda45678@gmail.com", "Selenium@123" }, 
				            { "seleniumpanda456789@gmail.com", "Selenium@123" } };
        return data;
	}
	
	

}
