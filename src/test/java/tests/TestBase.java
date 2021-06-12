package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;

import pageObjects.HomePage;

public class TestBase {

	protected  WebDriver driver ;
	protected HomePage homeObject;
	
	@BeforeClass
	public void setUp() {
		driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver,"https://demo.nopcommerce.com/");
		homeObject = new HomePage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
