package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass{
	
	LoginPage login;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   BaseClass.initialization();
	}

	@When("user enter valid email and password")
	public void user_enter_valid_email_and_password() {
	 LoginPage login = new LoginPage();
	 login.loginFunctionality("Admin","admin123");
	}

	@Then("user is on home page and validate user url")
	public void user_is_on_home_page_and_validate_user_url() {
	   String url =  driver.getCurrentUrl();
	  boolean a =  url.contains("dashboard");
	  Assert.assertEquals(a, true);
	}

}
