package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
	
	
	@Test 
	public void homepagetest() {
		getHomePage();
		homepage.clickOnCreateBtn();
	}

}
