package com.day13.TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Hard {
	
	//create the object of SoftAssert Class
	
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void testingHardAssert() {
		int i =1, j=2;
		Assert.assertTrue(i != j); //this is true
		Assert.assertFalse(i == j); //this is true
		Assert.assertTrue(i <= j, "if not tell i is not even less than equal to j"); //this is true
		Assert.assertNotEquals(i, j); //this is true
		
		Assert.assertEquals(i, j); //false
		Assert.assertTrue(i >= j , "if not tell i is not even greater than equal to j"); //this is false
		
		System.out.println(i+j); //3
		System.out.println("Grass is Green");
	}
	
	@Test
	public void testingSoftAssert() {
		int i =1, j=2;
		softassert.assertTrue(i == j); //this condition is false
		
		System.out.println(i+j); //3
		System.out.println("Grass is Green");
		
		softassert.assertAll();
	}

}
