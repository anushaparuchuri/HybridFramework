package com.testscenarios;

import java.io.FileInputStream;
import java.security.PublicKey;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class PodFoodsAssignment {

	// ClassName Reference Name = new classname()

	Locators loc = new Locators();

	@Test
	public void f() throws Exception {
		// Read the test data form Property file
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\td.properties");
		Properties p = new Properties();
		p.load(fi);

		WebDriver driver;

		driver = new ChromeDriver();
		driver.get(p.getProperty("pod_URL"));
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(loc.podfoods_Login_Button1).click();
		Thread.sleep(3000);
		driver.findElement(loc.podfoods_Email_Editbox).sendKeys(p.getProperty("pod_email"));
		driver.findElement(loc.podfoods_Password_Editbox).sendKeys(p.getProperty("pod_pwd"));
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(loc.podfoods_Password_Editbox));

		driver.findElement(loc.podfoods_Login_Button2).click();

		driver.quit();
	}
}
