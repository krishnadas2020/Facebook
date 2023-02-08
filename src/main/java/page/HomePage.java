package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel {
	
	public HomePage(WebDriver homepage) {
		super(homepage);
	}

	
	
	public void clickOnCreateBtn() {
		WebElement c = getCreateNewAccountButton();
		c.click();
	}
	
}
