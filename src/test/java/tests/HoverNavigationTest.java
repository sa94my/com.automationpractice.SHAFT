package tests;

import org.testng.annotations.Test;

import com.shaft.validation.Assertions;

import pageObjects.CellPhones;

public class HoverNavigationTest extends TestBase{
	CellPhones cellPhonesPageObject ;
	@Test
	public void method() {
		homeObject.hoverOverElectronics();
		cellPhonesPageObject = homeObject.chooseCellPhonesSubcategory();
		Assertions.assertEquals(cellPhonesPageObject.getPageTitle(), "Cell phones"); 
	
	}

}
