package com.dassault.qa.testnglearning;

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

public class TestNGFacebookWindowTest2 {

	WebDriver driver;
	String termswindow = null, cookiewindow = null, datawindow = null;

	@BeforeClass
	public void setUpClass() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.linkText("Data Policy")).click();
		driver.findElement(By.linkText("Cookie Policy")).click();
		
	}

	@BeforeMethod
	public void setUp() {

		Set<String> handles = driver.getWindowHandles();
		for (String h : handles) {
			driver.switchTo().window(h);
			System.out.println(driver.getTitle());

			if (driver.getTitle().contains("Terms")) {
				termswindow = h;
			}
			if (driver.getTitle().contains("Cookie")) {
				cookiewindow = h;
			}
			if (driver.getTitle().contains("Data")) {
				datawindow = h;
			}
		}

	}

	@Test
	public void termWindow() {

		driver.switchTo().window(termswindow);
		String expectedTerms = "Terms of Service";
		String actualTerms = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(actualTerms, expectedTerms);

	}

	@Test
	public void dataWindow() {

		driver.switchTo().window(datawindow);
		String expectedTerms = "Data Policy";
		String actualTerms = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(actualTerms, expectedTerms);

	}

	@Test
	public void cookieWindow() {
		driver.switchTo().window(cookiewindow);
		String expectedTerms = "Cookies & other storage technologies";
		String actualTerms = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(actualTerms, expectedTerms);

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
