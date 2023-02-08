package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAccountModel extends BaseModel {
	
	public CreateNewAccountModel(WebDriver cnaModel) {
		super(cnaModel);
	}
	
	
	
	public WebElement getFirstName() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		return fname;
	}
	public WebElement getLastName() {
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		return lname;
	}

}

//public WebElement getFullName() throws InterruptedException {
//	driver.navigate().refresh();
//	Thread.sleep(3000);
//	WebElement fullname = driver.findElement(By.xpath("//input[@name='fullName']"));
//	return fullname;
//}
