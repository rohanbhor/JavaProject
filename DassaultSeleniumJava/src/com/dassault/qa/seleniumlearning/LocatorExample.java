package com.dassault.qa.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");	
		
		WebElement searchButton = driver.findElement(By.className("gNO89b"));
		
		searchButton.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Learn Selenium in 1 Day")).click();
		
	}

}
