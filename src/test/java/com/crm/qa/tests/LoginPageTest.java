package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ClassicCRMPage;
import com.crm.qa.pages.ForgotPassPage;
import com.crm.qa.pages.FrontPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	FrontPage frontPage;
	ForgotPassPage forgetPassPage;
	ClassicCRMPage classicrmPage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		intialization();
		frontPage = new FrontPage();
		frontPage.loginRedirect();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void testLoginPageTitle() {
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void testLoginButtonEnable() {
		boolean btn = loginPage.loginButtonEnabled();
		Assert.assertTrue(btn);
	}
	
	@Test(priority=3)
	public void testClassicCRMDisplay() {
		Assert.assertTrue(loginPage.classicCRMEnabled());
	}
	
	@Test(priority=4)
	public void testClassicCRMRedirect() {
		classicrmPage = loginPage.classicCRMRedirect();
	}
	
	@Test(priority=5)
	public void testForgetPassword() {
		forgetPassPage = loginPage.forgotPassEnabled();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}	
