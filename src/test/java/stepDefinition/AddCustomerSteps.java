package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.AdminPage;
import pageObjects.LoginPage;


public class AddCustomerSteps extends BaseClass{

	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		login=new LoginPage(driver);
	}

	@When("User open {string}")
	public void user_open(String url) {
	    driver.get(url);
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String email, String pwd) {
	    login.setUserName(email);
	    login.setPassword(pwd);
	}

	@Then("click on login")
	public void click_on_login() throws InterruptedException {
		admin=login.clickOnLogin();
	}
	
	@Then("user can view dashboard")
	public void user_can_view_dashboard() {
	     Assert.assertEquals("Dashboard / nopCommerce administration", admin.getPageTitle());
	}
	@When("user click on customer menu item")
	public void user_click_on_customer_menu_item() {
	     
	     admin.clickOnCustomersMenu();
	}
	@When("click on customers option")
	public void click_on_customers_option() {
	     admin.clickOncustomersItem();
	     
	}
	@When("click on add new option")
	public void click_on_add_new_option() {
		addCustomerPage=admin.clickOnAddNew();
	}
	
	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
		
	}
	
	@When("user enters customer info")
	public void user_enters_customer_info() {
		addCustomerPage.setEmail();
		addCustomerPage.setFirstName();
		addCustomerPage.setLastName();
		addCustomerPage.setPassword();
		addCustomerPage.setAdminContent();
		   
	}
	@When("click on save button")
	public void click_on_save_button() {
		addCustomerPage.clickOnSave();
	}
	
	

}
