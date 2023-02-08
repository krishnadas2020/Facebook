package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {
	
	public HomeModel(WebDriver homemodel) {
		
		super(homemodel);
	}
	
	
	
	public WebElement getCreateNewAccountButton() {
		
		WebElement cna = driver.findElement(By.xpath("//a[text()='Create new account']"));		
		return cna;
		
		
	}

}
