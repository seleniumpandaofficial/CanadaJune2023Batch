package com.day10.TestNG_Part1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priorities_TestCases {

	@BeforeMethod
	public void openUrl() {
		System.out.println("Url opens");
	}

	@Test(priority = 1)
	public void tc1() {
		System.out.println("Test case 1");
	}

	@Test(priority = 2)
	public void tc2() {
		System.out.println("Test case 2");
	}

	@Test(priority = 3)
	public void tc3() {
		System.out.println("Test case 3");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Closing");
	}

}
