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
	
	//Check error message for email edit box(Blank data)
	@Test
	public void TC_08() throws Exception {
		//3. Click on Login button under Login to your account page
		clickByAnyLocator(loc.ae_Login_button);
		//Email address error message should display.Please fill out this filed
		takeScreenshot("TS_02_TC_08_");
	}
	
	
}
