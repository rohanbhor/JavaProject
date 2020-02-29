package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.base.POMBase;

public class FlipkartSearchResultsPage extends POMBase {

	@FindBy(xpath= "(//*[@class='_3O0U0u']/div)[1]")
	private WebElement firstitem;
	
	public FlipkartSearchResultsPage() {
		PageFactory.initElements(driver, this);
	}
	

	public void selectFirstItem() {
	
		firstitem.click();
	}

}
