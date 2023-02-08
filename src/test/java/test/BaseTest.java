package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.CreateNewAccountPage;
import page.HomePage;

public class BaseTest {

	static WebDriver driver;
	static HomePage homepage;
	static CreateNewAccountPage cnaPage;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void getHomePage() {
		homepage = new HomePage(driver);
	}
	
	public void getCreateNewAccountPage() {
		cnaPage = new CreateNewAccountPage(driver);
	}

}
