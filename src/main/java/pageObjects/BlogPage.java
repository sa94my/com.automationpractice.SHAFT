package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class BlogPage {

	private WebDriver driver =PageBase.driver;
	
	
	
	private By postsFrom_2018 = By.cssSelector("#blog-year-2018 a");
	
	public void filterBlog() {
		ElementActions.click(driver, postsFrom_2018);
		
	}
	
}
