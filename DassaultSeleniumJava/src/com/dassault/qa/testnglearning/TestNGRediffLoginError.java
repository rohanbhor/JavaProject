package com.dassault.qa.testnglearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGRediffLoginError {
	static WebDriver driver;

	@BeforeClass
	public void setUpClass() {
		System.setProperty("webdriver.chrome.driver","D:\\\\UE7_Medidata_Training\\\\downloads\\\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.rediffmail.com");
	}
	
	@BeforeMethod
	public void setUpMethod() {
		driver.findElement(By.linkText("Rediffmail")).click();
	}
	
	@AfterMethod
	public void tearDownMethod() {
		driver.close();
	}
	
	@Test
	public void testRediffLoginError() {
		
	    driver.findElement(By.name("login")).sendKeys("asd");
	    driver.findElement(By.name("passwd")).sendKeys("asd");
	    driver.findElement(By.name("proceed")).click();
	    String actual= driver.findElement(By.className("div_login_error")).getText();
	    String expected = "Temporary error occured[#5001], please try again.";
	    
	    Assert.assertEquals(actual, expected);
	    
	}  
    
}
