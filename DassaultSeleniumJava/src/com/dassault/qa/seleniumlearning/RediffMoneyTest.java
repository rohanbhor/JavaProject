package com.dassault.qa.seleniumlearning;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMoneyTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 
		
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='leftcontainer']//tr"));
				
		NumberFormat f =NumberFormat.getNumberInstance();
		 
		for(int i =1; i<rows.size();i++) {
		 String company = driver.findElement(By.xpath("//div[@id='leftcontainer']//tr["+i+"]//td[1]")).getText();	
		 String price = driver.findElement(By.xpath("//div[@id='leftcontainer']//tr["+i+"]//td[4]")).getText();
	
         Number num = f.parse(price);
         price = num.toString();
         double pricenumvalue = Double.parseDouble(price);
		 
			 
		 if(pricenumvalue<1000) {
		 System.out.println(company+" : "+pricenumvalue);
		 
		 }
		 
		 driver.quit();
		}
		
	}

}
