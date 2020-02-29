package com.dassault.qa.DassaultMavenPOMSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestNGBase {
	
	
	static ChromeOptions options = new ChromeOptions();
	static WebDriver driver;

	public TestNGBase() {
		launchBrowser();
	}

	public static void launchBrowser() {
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public static String getDateTimeStamp() {
		Date d = new Date();
		String stamp = d.toString().replace(":", "_").replace(" ", "_");
		return stamp;
	}
	
	
	public static void takeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\UE7_Medidata_Training\\Selenium_Dassault\\Screenshots\\"+getDateTimeStamp()+".jpg"));
	}
	
}
