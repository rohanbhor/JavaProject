package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.base.POMBase;

public class FlipkartAddressPage extends POMBase{

	@FindBy(xpath="//div[text()='Total Payable']/..//div[@class='_3GoQc2']")
	private WebElement pricelabel;

	public FlipkartAddressPage() {
		PageFactory.initElements(driver, this);
	}

	public String getPrice() {
		return pricelabel.getText();
		
	}
	
	

}
