package com.day10.TestNG_Part1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	// We will learn the sequence of execution of these Annotations in TestNG

	// @BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod > @Test >
	// @AfterMethod > @AfterClass > @AfterTest > @AfterSuite

	@BeforeSuite
	public void priorityCheck1() {
		System.out.println("@BeforeSuite - This should be priority 1 for execution");
	}

	@BeforeTest
	public void priorityCheck2() {
		System.out.println("@BeforeTest - This should be priority 2 for execution");
	}

	@BeforeClass
	public void priorityCheck3() {
		System.out.println("@BeforeClass - This should be priority 3 for execution");
	}

	@BeforeMethod
	public void priorityCheck4() {
		System.out.println("@BeforeMethod - This should be priority 4 for execution");
	}

	@Test
	public void testCase1() {
		System.out.println("@Test is the test case");
	}

	@AfterMethod
	public void priorityCheck5() {
		System.out.println("@AfterMethod - This should be priority 5 for execution");
	}

	@AfterClass
	public void priorityCheck6() {
		System.out.println("@AfterClass - This should be priority 6 for execution");
	}

	@AfterTest
	public void priorityCheck7() {
		System.out.println("@AfterTest - This should be priority 7 for execution");
	}
	
	@AfterSuite
	public void priorityCheck8() {
		System.out.println("@AfterSuite - This should be last for execution");
	}

}
