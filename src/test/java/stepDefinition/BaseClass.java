package stepDefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddNewCustomerPage;
import pageObjects.AdminPage;
import pageObjects.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage login;
	public AdminPage admin;
	public AddNewCustomerPage addCustomerPage;
	
	public static String randomString()
	{
		String generatedString=RandomStringUtils.random(5);
		return generatedString;
	}
}
