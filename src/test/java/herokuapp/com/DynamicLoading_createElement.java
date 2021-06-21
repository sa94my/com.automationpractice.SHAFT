package herokuapp.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Assertions;

import pageObjects.HomePage;

public class DynamicLoading_createElement {

	protected  WebDriver driver ;
	protected HomePage homeObject;
	
	@BeforeClass
	public void setUp() {
		driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver,"https://the-internet.herokuapp.com/dynamic_loading/2");
	}
	
	@Test
	public void DnamicTest() {
		driver.findElement(By.cssSelector("div#start button")).click();
		Assertions.assertElementAttribute(driver, By.cssSelector("div#finish"), Assertions.ElementAttributeType.TEXT, "Hello World!", "wrong text");
		//amaaazing
		
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
