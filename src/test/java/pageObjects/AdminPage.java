package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver driver;
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='nav-link']//i[@class='nav-icon far fa-user']")
	WebElement customersMenu;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
	WebElement customersItem;
	
	@FindBy(xpath="//i[@class='fas fa-plus-square']")
	WebElement addNewBtn;
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void clickOnCustomersMenu()
	{
		customersMenu.click();
	}
	
	public void clickOncustomersItem()
	{
		customersItem.click();
	}
	public AddNewCustomerPage clickOnAddNew()
	{
		addNewBtn.click();
		return new AddNewCustomerPage(driver);
	}
}
