package com.testscenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class FbRetestWithDataProvider {

	WebDriver driver;
	String res;

	@Test(dataProvider = "abc")
	public void f(String UN, String PWSD) throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(PWSD);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
				|| driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
			System.out.println("Given credential are in-valid***");
			res = "In-valid credential";

		} else {
			System.out.println("Given credential are valid***");
			res = "Valid credential";
		}
		System.out.println(res);
	}

	@DataProvider
	public Object[][] abc() {
		return new Object[][] { new Object[] { "Anushatestnewsdgsdgsdg34534@gmail.com", "3454rgdsgdsgsdfa" },
				new Object[] { "Sreenivasdgsdgssdfdg34534@gmail.com", "3sdgdsg454rgdsgdsgsdfa" },
				new Object[] { "testSreenivasdgsdgssdfdg34534@gmail.com", "test3sdgdsg454rgdsgdsgsdfa" }, };
	}
}
