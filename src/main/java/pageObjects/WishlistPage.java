package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;

public class WishlistPage {
	private WebDriver driver = PageBase.driver ;


	public WishlistPage() {
		BrowserActions.navigateToURL(driver, "https://demo.nopcommerce.com/wishlist");
		this.driver = PageBase.driver ;
	}

	
	public boolean elementSrearch_SKU(String sku) {
		 return ElementActions.isElementDisplayed(driver, By.xpath("//span [@class='sku-number']  [contains(.,'"+sku+"')]"));
	}
}
