package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FrontPage extends TestBase{
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//div[@class='rd-navbar-brand']//a[@title='free crm home']//span[@class='brand-slogan']")
	WebElement logoTagLine;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement sidesignUpBtn;
	
	@FindBy(xpath = "//a[text()='About']")
	WebElement aboutBtn;
	
	@FindBy(linkText = "Pricing")
	WebElement pricingBtn;
	
	// Initializing the Page Objects
	public FrontPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public String validateFrontPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateTagLineDisplay() {
		return logoTagLine.isDisplayed();
	}
	
	public String validateTagLine() {
		return logoTagLine.getText();
		
	}
	
	public boolean validateLoginButton() {
		return loginBtn.isDisplayed();
	}
	
	public boolean validateSignUpButton() {
		return signUpBtn.isDisplayed();
	}
	
	public LoginPage loginRedirect() {
		loginBtn.click();
		return new LoginPage();
	}
	
	public SignUpPage signUpRedirect() {
		signUpBtn.click();
		return new SignUpPage();
	}
	
	public SignUpPage sideSignUpRedirect() {
		sidesignUpBtn.click();
		return new SignUpPage();
	}
	
	public AboutPage aboutRedirect() {
		aboutBtn.click();
		return new AboutPage();
	}
	
	public PricingPage pricingRedirect() {
			aboutBtn.click();
		return new PricingPage();
	}
}


