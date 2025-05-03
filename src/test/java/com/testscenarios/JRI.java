package com.testscenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class JRI extends CommonFunctions {
	@Test
	public void testnew() throws Exception {
		 chromeBrowserLaunch();
		 driver.get("https://demo.automationtesting.in/Register.html");
		 
		 printAllDropdownValues(By.xpath("//select[@placeholder='Year']"));
	}

	// @Test
	public void f() throws Exception {
		chromeBrowserLaunch();
		getURL("JRI_URL");
		getCaptchaFromConsoleAndSendToEditBox(By.name("txtCaptcha"));
	}
}
