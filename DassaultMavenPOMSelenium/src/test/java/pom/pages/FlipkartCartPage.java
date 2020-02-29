package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.base.POMBase;

public class FlipkartCartPage extends POMBase {

	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement placeorderbutton;

	public FlipkartCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void placeOrder() {
		placeorderbutton.click();
		
	}
	
	
	
}
