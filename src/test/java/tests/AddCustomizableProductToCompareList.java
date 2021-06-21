package tests;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class AddCustomizableProductToCompareList extends TestBase{

	@Test
	public void customizablePcCompare() {
		homeObject.addCutomizableComputerToCompareList();
		assertFalse(homeObject.successNotificationIsDisplayed(),"product was added when it shouldn't");
	}
	
}
