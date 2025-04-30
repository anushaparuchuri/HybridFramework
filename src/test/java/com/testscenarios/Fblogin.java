package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Fblogin {
	public WebDriver driver;
	//ClassName objectReferenceName = new ClassName();
	
	//Create an Object for Locators class
	Locators loc = new Locators();
	

	@Test
	public void f() throws Exception {
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
		driver.quit();
	}

}
