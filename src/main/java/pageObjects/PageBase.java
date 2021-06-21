package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageBase {

	protected static WebDriver driver;
	
	public WebDriver getDriverInstance() {
		return driver ;
	}
	
	public void setDriverInstance(WebDriver driver) {
		PageBase.driver = driver;
	}
	
}
