package com.dassault.qa.testnglearning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFacebookWindowTest {

	static WebDriver driver;
	static String termwindow = null;
	static String policywindow = null;

	
	
	
	@BeforeClass
	public void setUpClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.linkText("Data Policy")).click();
	}	
		
	@BeforeMethod
	public void setUp() {
		Set<String> winhandle = driver.getWindowHandles();
		Iterator<String> it = winhandle.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			if (driver.getTitle().contains("Term"));
			{
				termwindow = driver.getWindowHandle(); // get current window handle
				System.out.println("Term window :" + termwindow);
			}
			if (driver.getTitle().contains("Data Policy"));
			{
				policywindow = driver.getWindowHandle(); // get current window handle
				System.out.println("Policy window :" + policywindow);
			}
		}
	}

	@Test
	public void testTermsWindow() {
		driver.switchTo().window(termwindow);
		String actualTOS = driver.findElement(By.tagName("h2")).getText();
		String expectedTOS = "Terms of Service";
		
		Assert.assertEquals(actualTOS, expectedTOS);
	
	}
	
	@Test
	public void testDataPolicyWindow()  {
		driver.switchTo().window(policywindow);
		String actualPolicy = driver.findElement(By.tagName("h2")).getText();
		String expectedPolicy = "Data Policy";
		
		Assert.assertEquals(actualPolicy, expectedPolicy);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	@AfterClass
	public void tearDownClass() {
		driver.quit();
	}
	
	
	
}
