package com.dassault.qa.javalearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.id("login1")).sendKeys("TestUser");
		//driver.findElement(By.id("password")).sendKeys("password");
		
		Boolean rememberCheckBox = driver.findElement(By.id("remember")).isSelected();
		if(rememberCheckBox==true) {
			driver.findElement(By.id("remember")).click();
			System.out.println("Checkbox unchecked");
		}
		
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		if(alert.getText().contains("Please enter a valid user name")) {
		alert.accept();
		System.out.println("Alert accepted");
		}else {
			System.out.println("No alert present");
		}
		
		driver.quit();
		
		
	}

}
