package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement loginbtn;
	
	public void setUserName(String username)
	{
		email.clear();
		email.sendKeys(username);
	}
	public void setPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public AdminPage clickOnLogin() throws InterruptedException
	{
		loginbtn.click();
		Thread.sleep(3000);
		
		return new AdminPage(driver);
	}
}
