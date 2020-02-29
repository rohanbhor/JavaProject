package com.dassault.qa.DassaultMavenPOMSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartMouseActionExample extends TestNGBase{

	
	@Test
	public void testFlipkartMoveToElectronicsAndTakeScreenshot() throws IOException {
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
		
		WebElement electronicslink = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		
		Actions myaction = new Actions(driver);
		myaction.moveToElement(electronicslink).build().perform();
		
		takeScreenshot();
		
	}
	
	
	
}
