package pom.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.base.POMBase;

public class FlipkartProductDetailsPage extends POMBase {
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement addtocartbutton;
	
	
	public FlipkartProductDetailsPage() {
		driver.switchTo().window(getWindowHandle("iPhone"));
		PageFactory.initElements(driver, this);
	}
	
	
	private String getWindowHandle(String string) {
		Set<String> allhandles = driver.getWindowHandles();
		String handletoreturn = null;
		
		for(String handle : allhandles) {
			driver.switchTo().window(handle);
			if(driver.getTitle().contains("string")) {
				handletoreturn= handle;
			}
		}
		return handletoreturn;
	}



	public void addToCart() {
		addtocartbutton.click();
		
	}

}
