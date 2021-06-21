package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;

import pageObjects.HomePage;
import pageObjects.PageBase;

public class TestBase {

	protected static  WebDriver driver ;
	private PageBase pageBaseObject = new PageBase() ;
	protected HomePage homeObject;
	
	@BeforeSuite
	public void setUp() {
		driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver,"https://demo.nopcommerce.com/");
		pageBaseObject.setDriverInstance(driver);

	}
	
	@BeforeClass
	public void setHome() {
		homeObject = new HomePage();

	}
	
	@AfterClass
	public void finaliseTest() {
		BrowserActions.navigateToURL(driver,"https://demo.nopcommerce.com/");

	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
