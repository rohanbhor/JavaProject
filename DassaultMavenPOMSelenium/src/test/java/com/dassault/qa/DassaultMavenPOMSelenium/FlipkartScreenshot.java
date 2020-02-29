package com.dassault.qa.DassaultMavenPOMSelenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class FlipkartScreenshot extends TestNGBase{

	@Test
	public void testFlipkartHomepageScreenshot() throws IOException {
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\UE7_Medidata_Training\\Selenium_Dassault\\Screenshots\\"+getDateTimeStamp()+".jpg"));
		
	}	
	
}
