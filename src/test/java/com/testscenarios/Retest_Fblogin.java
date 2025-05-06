package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Retest_Fblogin extends CommonFunctions {

	@Test
	public void f() throws Exception {
		String res;

		FileInputStream excelTestDataSheetPath = new FileInputStream(".\\src\\test\\resources\\testdata\\anusha.xlsx");
		Workbook w = new XSSFWorkbook(excelTestDataSheetPath);
		Sheet s = w.getSheet("FBlogin");
		// i= row
		for (int i = 1; i <= 5; i++) {
			Row r = s.getRow(i);
			Cell un = r.getCell(0);
			Cell pwsd = r.getCell(1);
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.findElement(loc.fbLogin_Email_Editbox).clear();
			driver.findElement(loc.fbLogin_Email_Editbox).sendKeys(un.getStringCellValue());
			driver.findElement(loc.fbLogin_Password_Editbox).sendKeys(pwsd.getStringCellValue());
			driver.findElement(loc.fbLogin_Login_Button).click();
			Thread.sleep(6000);
			// validate error message
			if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
					||
				driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
				System.out.println("Given credential are in-valid***");
				res = "In-valid credential";
			} else {
				System.out.println("Given credential are valid***");
				res = "Valid credential";
			}
			Cell results = r.createCell(2);
			results.setCellValue(res);
		}
		// Send results to excelsheet, we will use Fileoutputstream API
		FileOutputStream fo = new FileOutputStream(".\\src\\test\\resources\\testdata\\anusha.xlsx");
		w.write(fo);
		w.close();

	}

	@BeforeClass
	public void beforeClass() {
		// driver = new ChromeDriver();
		chromeIncognitoBrowserLaunch();

		// driver = new FirefoxDriver();
		// driver = new EdgeDriver();
		// driver.manage().window().maximize();
	}

	// @AfterClass
	public void afterClass() {
		// Close the current browser/window
		// driver.close();

		driver.quit();

	}

}
