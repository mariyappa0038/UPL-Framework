package testPages;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class LoginPage_Tests extends TestBase{ 

	String fileName = "C:\\Users\\USER\\OneDrive\\Desktop\\Registration.xlsx"; 

	ExcelOperations excel = new ExcelOperations(fileName, "Sheet1");
	
	
	@Test(dataProvider = "Test")
	public void logins(Object obj1) throws Exception {
	HashMap<String, String> testData = (HashMap<String, String>) obj1;
	LoginPageObjects n =new LoginPageObjects();
	String s = n.login(testData);
	System.out.println(s);
	int p=excel.getRowCount();
	System.out.println(p);
	
	int c=excel.getColCount();
	System.out.println(c);
	}	
	// Data provider method --> return object array	

	@DataProvider(name = "Test")
	public Object[][] testDataSupplier() throws Exception {
	Object[][] obj = new Object[excel.getRowCount()][1];
	for (int i = 1; i <= excel.getRowCount(); i++) {
	HashMap<String, String> testData = excel.getTestDataInMap(i);
	obj[i - 1][0] = testData;
	}
	return obj;
	}}	
		

	
	

	
				
		
	
	
	
	
	



