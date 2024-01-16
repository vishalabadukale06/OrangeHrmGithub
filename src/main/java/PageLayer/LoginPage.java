package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String Uname,String Pass)
	{
		uname.sendKeys(Uname);
		pass.sendKeys(Pass);
		login.click();
	}
	
	

}
