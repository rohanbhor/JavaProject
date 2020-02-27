package com.dassault.qa.javalearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Pune, IN - Lohegaon (PNQ)");
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
		
		
		driver.findElement(By.xpath("//dl[@class='vertical']//i[@class='icon ir datePicker'][contains(text(),'Cal')]")).click();
		driver.findElement(By.xpath("//div[@class='monthBlock first']//a[contains(@class,'ui-state-default')][contains(text(),'28')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@data-month='1']/a[text()='29']")).click();
		
		Select adult = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		adult.selectByVisibleText("2");
		
		Select children = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
		children.selectByVisibleText("2");
		
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		Thread.sleep(10000);
		String lowPrice = driver.findElement(By.xpath("(//h2[@class='totalAmount'])[1]")).getText();
		System.out.println("Lowest Price is :"+lowPrice );
		//driver.quit();
		
		
		
	}
	
	
}
