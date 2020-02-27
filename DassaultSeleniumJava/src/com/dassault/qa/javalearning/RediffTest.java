package com.dassault.qa.javalearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("TestUser");
		driver.findElement(By.id("password")).sendKeys("password");
		
		Boolean rememberCheckBox = driver.findElement(By.id("remember")).isSelected();
		if(rememberCheckBox==true) {
			driver.findElement(By.id("remember")).click();
			System.out.println("Checkbox unchecked");
		}
		
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		String actualErrorMsg = driver.findElement(By.className("div_login_error")).getText();
		String expectedErrorMsg= "Wrong username and password combination.";
		
		if(actualErrorMsg.equals(expectedErrorMsg)) {
		System.out.println("Test Passed");
		}
		
		driver.quit();
	}

}
