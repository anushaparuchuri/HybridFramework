package com.testscenarios;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class TS_02_VerifyUserwillAbleToLogin_Logout extends CommonFunctions {

	@Test
	public void TC_06() throws Exception {
		chromeBrowserLaunch();
		getURL("ae_URL");
		sendKeysByAnyLocator(loc.ae_Login_email_editbox, "ae_EmailAddress");
		sendKeysByAnyLocator(loc.ae_Login_password_editbox, "ae_Password");
		clickByAnyLocator(loc.ae_Login_button);
		verifyTexttobePresent(loc.ae_Login_UserNameLink, "expectedLoggedInUserName");
	}

	@Test
	public void TC_07() throws Exception {
		clickByAnyLocator(loc.ae_Login_LogoutLink);
	}

	// Check error message for email edit box(Blank data)
	@Test
	public void TC_08() throws Exception {
		// 3. Click on Login button under Login to your account page
		clickByAnyLocator(loc.ae_Login_button);
		// Email address error message should display.Please fill out this filed
		takeScreenshot("TS_02_TC_08_");
	}

	// Check error message for email edit box with dummy/invalid input
	@Test
	public void TC_09() throws Exception {
		sendKeysByAnyLocator(loc.ae_Login_email_editbox, "ae_dummy_without@_EmailAddress");
		takeScreenshot("TS_02_TC_09_");
	}

	// Check error message for password edit box (Blank data)
	@Test
	public void TC_10() throws Exception {
		sendKeysByAnyLocator(loc.ae_Login_email_editbox, "ae_EmailAddress");
		clickByAnyLocator(loc.ae_Login_button);
		takeScreenshot("TS_02_TC_10_");
	}

	// Check error message for email&password edit boxes with dummy/invalid inputs
	@Test
	public void TC_11() throws Exception {
		sendKeysByAnyLocator(loc.ae_Login_email_editbox, "ae_dummy_EmailAddress");
		sendKeysByAnyLocator(loc.ae_Login_password_editbox, "ae_dummy_Password");
		clickByAnyLocator(loc.ae_Login_button);
		takeScreenshot("TS_02_TC_11_");
	}

}
