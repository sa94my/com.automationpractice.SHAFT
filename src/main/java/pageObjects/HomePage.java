package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class HomePage {

	private WebDriver driver ;
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}
	
	private By electronicsCategoryLink = By.xpath("//ul[contains(@class,'notmobile')] //a[contains(.,'Electronics')]");
	private By cellPhonesSubCategory = By.xpath("//ul[contains(@class,'notmobile')] //a[contains(.,'Cell phones')]");
	private By blogLink = By.xpath("//a[contains(.,'Blog')]");
	
	
	public void hoverOverElectronics() {
		ElementActions.hover(driver, electronicsCategoryLink);
	}
	
	public CellPhones chooseCellPhonesSubcategory() {
		ElementActions.click(driver, cellPhonesSubCategory);
		return new CellPhones(driver);
	}
	
	public BlogPage goToBlogPage() {
		ElementActions.click(driver, blogLink);
		return new BlogPage(driver);
	}
}
