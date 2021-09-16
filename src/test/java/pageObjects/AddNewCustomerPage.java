package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	public WebDriver driver;
	public AddNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Company")
	WebElement companyname;
	
	@FindBy(id="AdminComment")
	WebElement admincontent;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form/div[1]/div/button[1]")
	WebElement save;
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void setEmail()
	{
		email.sendKeys("abcde123@gmail.com");
	}
	
	public void setPassword()
	{
		password.sendKeys("abcde");
	}
	
	public void setFirstName()
	{
		lastname.sendKeys("Aman");
	}
	
	public void setLastName()
	{
		companyname.sendKeys("Sharma");
	}
	
	public void setAdminContent()
	{
		admincontent.sendKeys("Admin");
	}
	
	public void clickOnSave()
	{
		save.click();
	}
}
