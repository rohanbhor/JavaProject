package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;
import pom.base.POMBase;

public class GoogleHomePage extends POMBase{

	@FindBy(name ="q")
	private WebElement searchbox;
	
	@FindBy(name ="btnK")
	private WebElement searchbutton;
	

	public GoogleHomePage() {
		super.launchBrowser();
		driver.get("https://www.google.com");	
		PageFactory.initElements(driver, this);
	}


	public void search(String string) {
		searchbox.sendKeys(string);
		searchbutton.click();	
	}

}
