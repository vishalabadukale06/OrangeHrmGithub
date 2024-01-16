package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim;

	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void clickOnPimLink() {
		
		
		pim.click();
			
	}
	 public String ValidatePimPage() {
		 
	return	driver.getCurrentUrl() ;
		
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
}
