package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

/**
 * @author Parth
 *
 */

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailField;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	WebElement forgotPass;
	
	@FindBy(xpath="//a[contains(text(),'Classic CRM')]")
	WebElement classicCRM;
	
	@FindBy(xpath="//a[contains(text(),'Sign')]")
	WebElement signUp;
	
	// Initializing the Page Objects
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean loginButtonEnabled() {
		return loginBtn.isEnabled();
	}
	
	public ForgotPassPage forgotPassEnabled() {
		forgotPass.click();
		return new ForgotPassPage();
	}
	
	public boolean classicCRMEnabled() {
		return classicCRM.isDisplayed();
	}
	
	public ClassicCRMPage classicCRMRedirect() {
		classicCRM.click();
		return new ClassicCRMPage();
	}
	
	public boolean signUpEnabled() {
		return signUp.isDisplayed();
	}
	
	public HomePage login(String user, String pass) {
		emailField.sendKeys(user);
		passwordField.sendKeys(pass);
		loginBtn.click();
		return new HomePage();
	}
	
}
