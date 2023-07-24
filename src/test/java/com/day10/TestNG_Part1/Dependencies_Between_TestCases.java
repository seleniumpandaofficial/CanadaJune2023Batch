package com.day10.TestNG_Part1;

import org.testng.Assert;
import org.testng.annotations.Test;

//if TestCase1 fails, all other Test Cases executing makes no sense because they are dependent on TC1

public class Dependencies_Between_TestCases {
	
	@Test(priority = 1)
	public void tc1() {
		System.out.println("This is the most imp test case");
	}
	
	@Test(priority = 2, dependsOnMethods = "tc1")
	public void tc2() {
		System.out.println("This is dependent on TC1");
	}
	
	@Test(priority = 3, dependsOnMethods = {"tc1", "tc2"})
	public void tc3() {
		System.out.println("This is dependent on both TC1 and TC2");
		Assert.fail();
	}
	
	@Test(priority = 4, dependsOnMethods = {"tc1", "tc2", "tc3"}, alwaysRun = true)
	public void tc4() {
		System.out.println("This is dependent on TC1, TC2 and TC3");
	}

}
