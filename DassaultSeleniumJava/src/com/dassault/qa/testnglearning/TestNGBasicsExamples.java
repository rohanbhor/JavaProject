package com.dassault.qa.testnglearning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasicsExamples {
	
	@Test
	public void testOne() {
		System.out.println("Inside Test Ones");
	}
	
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Inside Set Up");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Inside Tear Down");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Inside Test Two");
	}
	
	
	@BeforeClass
	public void setUpClass() {
		System.out.println("Inside Set up class");
	}
	
	@AfterClass
	public void tearDownClass() {
		System.out.println("Inside tear down class");
	}

}
