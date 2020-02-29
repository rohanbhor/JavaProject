package com.dassault.qa.seleniumlearning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String termwindow=null, policywindow = null;
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.linkText("Data Policy")).click();
			
		
		Set<String> winhandle = driver.getWindowHandles();
		Iterator<String> it = winhandle.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			
			if(driver.getTitle().contains("Term"));{
				termwindow= driver.getWindowHandle();   //get current window handle
				System.out.println("Term window :" + termwindow);
			}
			
			if(driver.getTitle().contains("Data Policy"));{
				policywindow= driver.getWindowHandle(); //get current window handle
				System.out.println("Policy window :" + policywindow);
				
			}
			
		}
		
		
		driver.switchTo().window(termwindow);

		String actualTOS = driver.findElement(By.xpath("//h2[text()='Terms of Service']")).getText();
		String expectedTOS = "Terms of Service";
		if(actualTOS.equals(expectedTOS)) {
			System.out.println("Test Passed");
		}
		
	}

}
