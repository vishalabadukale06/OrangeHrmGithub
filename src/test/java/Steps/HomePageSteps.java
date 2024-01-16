package Steps;

import org.testng.Assert;

import PageLayer.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	private HomePage homepage;
	
	
	
	@When("user click on pim page")
	public void user_click_on_pim_page() {
		
		homepage = new HomePage();
		
		homepage.clickOnPimLink();
		
	  
	}
	@Then("validate user is on pim page")
	public void validate_user_is_on_pim_page() {
		String url = homepage.ValidatePimPage();
		Assert.assertEquals(url.contains("pim"),true);
		
	  
	}
}
