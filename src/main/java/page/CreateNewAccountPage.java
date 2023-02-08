package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel {
	
	public CreateNewAccountPage(WebDriver cnaPage) {
		super(cnaPage);
	}
	
	
	
	
	public void typeFirstName(String f) {
		
		WebElement fname = getFirstName();
		fname.clear();
		fname.sendKeys(f);
		
	}
	
	public void typeLastName(String l) {
		WebElement lname = getLastName();
		lname.clear();
		lname.sendKeys(l);
	}

	
	// change code
}
