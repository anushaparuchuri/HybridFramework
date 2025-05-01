package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_01_Register {

	WebDriver driver;

	public void verifyElementOnScreen(By locator) {
		if (driver.findElements(locator).size() > 0) {
			System.out.println(locator + " is displayed on current screen");
		} else {
			System.out.println(locator + " is NOT displayed on current screen");
		}
	}

	@Test
	public void tc_01() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/products");
		Thread.sleep(3000);
		// Check home page has displayed or not: verify All Products text has
		// displayed/visible?
//		if (driver.findElements(By.xpath("//*[text()='All Products']")).size() > 0) {
//			System.out.println("products page successfully displayed without any errors");
//			System.out.println("TC_01 Passed");
//		} else {
//			System.out.println("products page NOT displayed ****");
//			System.out.println("TC_01 Failed");
//		}

		verifyElementOnScreen(By.xpath("//*[text()='All Products']"));

		System.out.println("tc_01() passed");
	}

	@Test
	public void tc_02() throws InterruptedException {
		// 2. User clicks on Signup / Login menu
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
		Thread.sleep(3000);
		// 3. Check log in page has displayed
//		if (driver.findElements(By.xpath("//*[text()='New User Signup!']")).size() > 0) {
//			System.out.println("Signup / Login page successfully displayed without any errors");
//			System.out.println("TC_02 Passed");
//		} else {
//			System.out.println("Signup / Login page NOT displayed ****");
//			System.out.println("TC_02 Failed");
//		}

		verifyElementOnScreen(By.xpath("//*[text()='New User Signup!']"));
		System.out.println("tc_02() passed");
	}

	@Test
	public void tc_03_and_04() throws InterruptedException {
		// Login to your account form: Email address editbox validation
//		if (driver.findElements(By.xpath("(//*[@name='email'])[1]")).size() > 0) {
//			System.out.println("Email address editbox displayed under Login to your account form");
//			System.out.println("TC_03 Passed");
//		} else {
//			System.out.println("Email address editbox is NOT displayed under Login to your account form");
//			System.out.println("TC_03 Failed");
//		}
		verifyElementOnScreen(By.xpath("(//*[@name='email'])[1]"));
		verifyElementOnScreen(By.name("password"));
		verifyElementOnScreen(By.xpath("//*[@data-qa='login-button']"));

		verifyElementOnScreen(By.name("name"));
		verifyElementOnScreen(By.xpath("(//*[@name='email'])[2]"));
		verifyElementOnScreen(By.xpath("//*[@data-qa='signup-button']"));
		System.out.println("tc_03 and 04 passed");
	}

	// Verify user will able to create an account
	@Test
	public void tc_05() throws InterruptedException {

		driver.findElement(By.name("name")).sendKeys("Anusha");
		driver.findElement(By.xpath("(//*[@name='email'])[2]")).sendKeys("Anushatest123@yahho.com");
		// Signup button click
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
		Thread.sleep(1000);
		System.out.println("tc_05() passed");

		// Continue to design rest of fields

		// title radio button
		driver.findElement(By.xpath("//*[@id='uniform-id_gender2']")).click();
		driver.findElement(By.name("password")).sendKeys("Anusha123");
		Select day = new Select(driver.findElement(By.name("days")));
		day.selectByVisibleText("15");
		Select month = new Select(driver.findElement(By.name("months")));
		month.selectByVisibleText("August");
		Select year = new Select(driver.findElement(By.name("years")));
		year.selectByVisibleText("1947");
		
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("optin")).click();
		driver.findElement(By.name("first_name")).sendKeys("Anusha");
		driver.findElement(By.name("last_name")).sendKeys("Anu");
		driver.findElement(By.name("address1")).sendKeys("1012 W dr 80004");
		Select cntry = new Select(driver.findElement(By.name("country")));
		cntry.selectByVisibleText("United States");
		driver.findElement(By.name("state")).sendKeys("AZ");
		driver.findElement(By.name("city")).sendKeys("Mesa");
		driver.findElement(By.name("zipcode")).sendKeys("80004");
		driver.findElement(By.name("mobile_number")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();		
		verifyElementOnScreen(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
		System.out.println("Account has been created successfully");	

	}

}
