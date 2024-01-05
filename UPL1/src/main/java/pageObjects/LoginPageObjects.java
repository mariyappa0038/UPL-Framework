package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableComponents.CommonConstants;
import testBase.TestBase;

public class LoginPageObjects extends TestBase {
	
	//Orange url

	@FindBy(xpath = "//input[@placeholder='Username'] ")
	WebElement username; 
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;
	
	
	//UPL
		/*
		 * @FindBy(xpath = "//a[contains(text(),'Login')]") WebElement login;
		 * 
		 * @FindBy(xpath = "//input[@name='identifier'] ") WebElement username;
		 * 
		 * @FindBy(xpath = "//input[@name='password']") WebElement password;
		 * 
		 * @FindBy(xpath = "//button[normalize-space()='LOGIN']") WebElement Login;
		 */
	//constructor - to use initElement method
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);	
	}
	public String login(HashMap<String, String> data) throws Exception {
	
	System.out.println(driver);
	
		
		Thread.sleep(1000);
		//login.click();
		username.sendKeys(data.get(CommonConstants.USERNAME).toString());
		//username.sendKeys(testData.get("username").toString());
		password.sendKeys(data.get(CommonConstants.PASSWORD).toString());
		
		Login.click();
		Thread.sleep(1000);
		return driver.getTitle();
		
		
	}}
	


