package pom.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.pages.FlipkartAddressPage;
import pom.pages.FlipkartCartPage;
import pom.pages.FlipkartHomePage;
import pom.pages.FlipkartProductDetailsPage;
import pom.pages.FlipkartSearchResultsPage;

public class FlipkartEndToEndTest {

	@Test
	public void testFlipkartWorkflow() {
		
		FlipkartHomePage homepage = new FlipkartHomePage();
		homepage.search("iphone");
		
		FlipkartSearchResultsPage resultspage = new FlipkartSearchResultsPage();
		resultspage.selectFirstItem();
		
		FlipkartProductDetailsPage productpage = new FlipkartProductDetailsPage();
		productpage.addToCart();
		
		FlipkartCartPage cart = new FlipkartCartPage();
		cart.placeOrder();
		
		FlipkartAddressPage addresspage = new FlipkartAddressPage();
		String actual = addresspage.getPrice();
		String expected = "₹27,999";
		
		Assert.assertEquals(actual, expected);
		
		
	}
	
	
}
