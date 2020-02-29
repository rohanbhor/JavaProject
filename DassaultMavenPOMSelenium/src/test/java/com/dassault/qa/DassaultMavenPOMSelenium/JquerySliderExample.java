package com.dassault.qa.DassaultMavenPOMSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JquerySliderExample extends TestNGBase{

	
	@Test
	public void testFlipkartMoveToElectronicsAndTakeScreenshot() throws IOException, InterruptedException {
		
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
			
		String percentagestring = source.getAttribute("style");
		
		/*
		int counter=10;
		while(percentagestring != "left: 52%;") {
			new Actions(driver).dragAndDropBy(source, counter+1, 0).build().perform();
			percentagestring = source.getAttribute("style");
			System.out.println(counter+":"+percentagestring);
			counter++;
			Thread.sleep(1000);
		}
		
		//int xOffset = (slider.getSize().width)/2;
	
		//new Actions(driver).dragAndDropBy(source, xOffset, 0).build().perform();
		*/
		
		String percentage="";
		int percentageint=0;
		int counter=0;
		while(percentageint<50) {
			int index = percentagestring.indexOf(";");
			percentage =(String)percentagestring.subSequence(index-3, index-1);
			percentage = percentage.trim();
			percentageint = Integer.parseInt(percentage);
			
			new Actions(driver).dragAndDropBy(source, counter+1, 0).build().perform();
			percentagestring = source.getAttribute("style");
			System.out.println(counter+":"+percentagestring);
			counter++;
		}
		
		Thread.sleep(5000);
		takeScreenshot();
		
	}
}
