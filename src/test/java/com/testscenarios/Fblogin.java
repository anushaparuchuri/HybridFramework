package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Fblogin extends CommonFunctions {

	@Test
	public void f() throws Exception {
		chromeBrowserLaunch();
		getURL("fbURL");
		sendKeysByAnyLocator(loc.fbLogin_Email_Editbox, "fbUN");
		sendKeysByAnyLocator(loc.fbLogin_Password_Editbox, "fbPWD");
		clickByAnyLocator(loc.fbLogin_Login_Button);
		driver.quit();

	}

}
