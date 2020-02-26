package com.dassault.qa.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String actual = driver.getTitle();
		String expected = "Google";
		
		if(actual.equals(expected)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		
		
		driver.close();
    	driver.quit();
		
		
		
		
	}

}
