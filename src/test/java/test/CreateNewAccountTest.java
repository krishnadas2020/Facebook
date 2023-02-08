package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import lib.ExcelReader;

public class CreateNewAccountTest extends BaseTest {
	
	@Test (dataProvider = "dp")
	public void CreateNewAccountPagetest(String firstname, String lastname) {
		getHomePage();
		homepage.clickOnCreateBtn();
		getCreateNewAccountPage();
		cnaPage.typeFirstName(firstname);
		cnaPage.typeLastName(lastname);
		
		
		
	}
	
	@DataProvider(name = "dp")
	
	public Object[][] getdata() throws IOException{
		Object[][]r;
		String filename = "data/ExcelReadTesting.xlsx";
		String sheetname = "Sheet2";
		
		ExcelReader er = new ExcelReader(filename,sheetname);
		r=er.ExcelToArray();
		return r;



}
}
