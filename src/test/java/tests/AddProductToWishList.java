package tests;

import org.testng.annotations.Test;

import com.shaft.validation.Assertions;

import pageObjects.WishlistPage;
import tests.TestBase;

public class AddProductToWishList extends TestBase{
	
	String htcMobileSku = "M8_HTC_5L";

	@Test
	public void duplicateProductWishlistTest() {
		homeObject.addHtcMobileToWishlist();
		WishlistPage wishlist = new WishlistPage();
		Assertions.assertTrue(wishlist.elementSrearch_SKU(htcMobileSku));
		
	}
	
}
