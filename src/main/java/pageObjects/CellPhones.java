package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class CellPhones {
	private WebDriver driver=PageBase.driver;
	
	
	
	private By pageTitle = By.tagName("h1");
	
	
	public String getPageTitle() {
		return ElementActions.getText(driver, pageTitle);
	}
}
