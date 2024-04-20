package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class HomePage extends BaseClass{

	
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
		
	}
	
		
	@FindBy(xpath="//input[@id=\"username\"]")
	WebElement InputField;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement PassFiled;
	
	@FindBy(xpath="//button[@id=\"submit\"]")
	WebElement ButtonSubmit;
	
	
	public WebElement EnterUsername() {
		 return InputField;
		 
		
	}
	public WebElement EnterPassword() {
		return PassFiled;
		
	}
	
	public WebElement SubmitButton() {
		
		return ButtonSubmit;
	}
}