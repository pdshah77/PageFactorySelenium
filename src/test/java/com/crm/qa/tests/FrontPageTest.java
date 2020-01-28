package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AboutPage;
import com.crm.qa.pages.FrontPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class FrontPageTest extends TestBase {
	FrontPage frontPage;
	LoginPage loginPage;
	SignUpPage signupPage;
	AboutPage aboutPage;
	public FrontPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		frontPage = new FrontPage();
	}
	
	@Test(priority=1)
	public void frontPageTitleTest() {
		String title = frontPage.validateFrontPageTitle();
		Assert.assertEquals(title,"Free CRM #1 cloud software for any business large or small");
	}
	
	@Test(priority=2)
	public void tagLineTest() {
		boolean tag = frontPage.validateTagLineDisplay();
		Assert.assertTrue(tag);
	}
	
	@Test(priority=3)
	public void tagLineDetailTest() {
		String tag = frontPage.validateTagLine();
		Assert.assertEquals(tag,"YOUR BUSINESS CLOUD PARTNER","Tag Line Mismatch");
	}
	
	@Test(priority=4)
	public void loginButtonDispplayedTest() {
		boolean loginTag = frontPage.validateLoginButton();
		Assert.assertTrue(loginTag);
	}
	
	@Test(priority=5)
	public void signUpButtonDisplayedTest() {
		boolean signupTag = frontPage.validateSignUpButton();
		Assert.assertTrue(signupTag);
	}
	
	@Test(priority=6)
	public void loginRedirectTest() {
		loginPage = frontPage.loginRedirect();
	}
	
	@Test(priority=7)
	public void signUpRedirectTest() {
		signupPage = frontPage.signUpRedirect();
	}
	
	@Test(priority=8)
	public void sideSignUpRedirectTest() {
		signupPage = frontPage.sideSignUpRedirect();
	}
	
	@Test(priority=9)
	public void aboutRedirectTest() {
		aboutPage = frontPage.aboutRedirect();
	}
	
	@Test(priority=10)
	public void pricingRedirectTest() {
		signupPage = frontPage.sideSignUpRedirect();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
