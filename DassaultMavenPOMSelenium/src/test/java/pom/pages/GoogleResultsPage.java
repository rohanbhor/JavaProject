package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.base.POMBase;

public class GoogleResultsPage extends POMBase {

	@FindBy(xpath="(//*[@class='LC20lb DKV0Md'])[1]")
	public WebElement firstlink;
	
	public GoogleResultsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getFirstLink() {	
		return firstlink.getText();
	}
	
	
	

}
