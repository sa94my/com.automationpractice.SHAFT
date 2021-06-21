package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class HomePage {

	private WebDriver driver =PageBase.driver;



	private By electronicsCategoryLink = By.xpath("//ul[contains(@class,'notmobile')] //a[contains(.,'Electronics')]");
	private By cellPhonesSubCategory = By.xpath("//ul[contains(@class,'notmobile')] //a[contains(.,'Cell phones')]");
	private By blogLink = By.xpath("//a[contains(.,'Blog')]");
	private By htcMobile_WishlistButton = By.xpath("//div[@class='details'] [h2=contains(.,'HTC One M8 ')] //button[3]");
	private By customizableDesktop_compareButton = By.xpath("//div[@class='details'] [h2=contains(.,'computer')] //button[2]");
	private By successNotificationBar = By.cssSelector("div.bar-notification.success");

	public void addHtcMobileToWishlist() {
		ElementActions.click(driver, htcMobile_WishlistButton);
		
	}
	
	public void addCutomizableComputerToCompareList() {
		ElementActions.click(driver, customizableDesktop_compareButton);
	}

	public void hoverOverElectronics() {
		ElementActions.hover(driver, electronicsCategoryLink);
	}

	public CellPhones chooseCellPhonesSubcategory() {
		ElementActions.click(driver, cellPhonesSubCategory);
		return new CellPhones();
	}

	public BlogPage goToBlogPage() {
		ElementActions.click(driver, blogLink);
		return new BlogPage();
	}
	
	public boolean successNotificationIsDisplayed() {
		return ElementActions.isElementDisplayed(driver, successNotificationBar);
	}
}
