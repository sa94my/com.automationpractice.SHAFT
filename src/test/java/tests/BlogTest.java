package tests;

import org.testng.annotations.Test;

import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.BrowserAttributeType;

import pageObjects.BlogPage;

public class BlogTest extends TestBase{
	BlogPage blogPageObject ;

	@Test
	public void blogFilteringTest() {
		blogPageObject =homeObject.goToBlogPage();
		blogPageObject.filterBlog();
		Assertions.assertBrowserAttribute(driver, BrowserAttributeType.CURRENT_URL, "https://demo.nopcommerce.com/blog/month/2018-7");
		
	}
	
	
}
