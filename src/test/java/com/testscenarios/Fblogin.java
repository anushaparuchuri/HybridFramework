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
<<<<<<< HEAD
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(loc.fbLogin_Email_Editbox).clear();
		driver.findElement(loc.fbLogin_Email_Editbox).sendKeys("AnushaTest@gmail.sdgsom");
		driver.findElement(loc.fbLogin_Password_Editbox).sendKeys("testsdgsdgdsg");
		driver.findElement(loc.fbLogin_Login_Button).click();
		Thread.sleep(3000);
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	//@AfterClass
	public void afterClass() {
		// Close the current browser/window
		//driver.close();
=======
		chromeBrowserLaunch();
		getURL("fbURL");
		sendKeysByAnyLocator(loc.fbLogin_Email_Editbox, "fbUN");
		sendKeysByAnyLocator(loc.fbLogin_Password_Editbox, "fbPWD");
		clickByAnyLocator(loc.fbLogin_Login_Button);
<<<<<<< HEAD
>>>>>>> branch 'master' of https://github.com/anushaparuchuri/HybridFramework
=======
		Thread.sleep(6000);
//		takescreenshot
		takeScreenshot("Anusha");
>>>>>>> branch 'master' of https://github.com/anushaparuchuri/HybridFramework
		driver.quit();

	}

}
