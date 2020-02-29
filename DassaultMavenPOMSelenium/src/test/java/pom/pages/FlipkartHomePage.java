package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.base.POMBase;

public class FlipkartHomePage extends POMBase{

	@FindBy(className="vh79eN")
	public WebElement searchicon;
	
	@FindBy(name="q")
	public WebElement searchbox;
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	public WebElement popupcrossbutton;
	

	public FlipkartHomePage() {
		launchBrowser();
		driver.get("https://www.flipkart.com/");
		PageFactory.initElements(driver, this);
		popupcrossbutton.click();	
	}
	
	public void search(String string) {
		// TODO Auto-generated method stub
		searchbox.sendKeys(string);
		searchicon.click();
	
	}

}
