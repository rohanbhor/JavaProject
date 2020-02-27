package com.dassault.qa.javalearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DestinationQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://destinationqa.com/aut-samplepersonalinformationform/");
		driver.findElement(By.name("firstname")).sendKeys("Rohan");
		driver.findElement(By.name("lastname")).sendKeys("Bhor");
		driver.findElement(By.name("address")).sendKeys("Pune");
		driver.findElement(By.xpath("//p[text()='Phone :']/following-sibling::p/input")).sendKeys("7755913220");
		driver.findElement(By.xpath("//div[@id='PIform2']/input[@value='male']")).click();
		driver.findElement(By.xpath("//input[@name='vehicle' and @value='Bike']")).click();
		
		Select color = new Select(driver.findElement(By.name("Colors")));
		color.selectByVisibleText("Black");
		
		List<WebElement> options = color.getOptions();
		for(WebElement e : options) {
			System.out.println(e.getText());
		}
		
		driver.findElement(By.name("user")).sendKeys("Rohan");
		driver.findElement(By.name("pwd")).sendKeys("password");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.quit();
	}

}
