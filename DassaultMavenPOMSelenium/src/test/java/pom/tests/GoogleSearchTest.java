package pom.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.pages.GoogleHomePage;
import pom.pages.GoogleResultsPage;

public class GoogleSearchTest {

	@Test
	public void testGoogleSearch() {
		
		GoogleHomePage homepage = new GoogleHomePage();
		homepage.search("Selenium");
		
		GoogleResultsPage resultpage = new GoogleResultsPage();
		String actual = resultpage.getFirstLink();
		System.out.println("Actual string is :"+actual );
		
		String expected = "Selenium";
		
		Assert.assertEquals(actual, expected);
	}
	
	
}
