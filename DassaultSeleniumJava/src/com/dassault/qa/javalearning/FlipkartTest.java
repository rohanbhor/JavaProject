package com.dassault.qa.javalearning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		//Thread.sleep(10000);
		WebElement we = driver.findElement(By.xpath("//li[@class='_1va75j'][last()]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(we, "iphone"));
		
		
		List<WebElement> list = driver.findElements(By.xpath("//button[@class='vh79eN']/../following-sibling::ul/li"));
		for(WebElement e : list) {
			System.out.println(e.getText());
		}
		
		
		//driver.findElement(By.xpath("//button[@class='vh79eN']")).click();;
	 
		
		
		
//		String tabletLink = driver.findElement(By.linkText("Tablets")).getText();
//		System.out.println(tabletLink + "Link is Present");
		driver.quit();
	}

}
