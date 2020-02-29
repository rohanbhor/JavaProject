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

public class RediffMoneyTest2 {

	public static void main(String[] args) throws ParseException, InterruptedException {
		// TODO Auto-generated method stub
		 
		
		System.setProperty("webdriver.chrome.driver", "D:\\UE7_Medidata_Training\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.get("https://money.rediff.com/gainers");
		
		
		Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));
		
			
		NumberFormat f =NumberFormat.getNumberInstance();
		 
		for(int i =1; i<rows.size();i++) {
		 String company = table.findElement(By.xpath("./tbody//tr["+i+"]//td[1]")).getText();	
		 String price = table.findElement(By.xpath("./tbody//tr["+i+"]//td[4]")).getText();
	
         Number num = f.parse(price);
         price = num.toString();
         double pricenumvalue = Double.parseDouble(price);
         
		 if(pricenumvalue<1000) {
		 System.out.println(company+" : "+pricenumvalue);
		 
		 }
		 
		 //driver.quit();
		}
		
	}

}
