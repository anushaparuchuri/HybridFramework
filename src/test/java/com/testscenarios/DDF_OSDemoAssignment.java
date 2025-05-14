package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class DDF_OSDemoAssignment extends CommonFunctions {

	@Test
	public void testnew() throws Exception {
		chromeBrowserLaunch();
		String res;

		Locators loc = new Locators();

		FileInputStream exceltestdatasheetpath = new FileInputStream(".\\src\\test\\resources\\testdata\\anusha.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(exceltestdatasheetpath);
		Sheet s = w.getSheet("OpenSource");

		for (int i = 1; i <7; i++) {
			Row r = s.getRow(i);
			Cell un = r.getCell(0);
			Cell pswd = r.getCell(1);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(4000);
			driver.findElement(loc.os_Username_editbox).sendKeys(un.getStringCellValue());
			driver.findElement(loc.os_password_editbox).sendKeys(pswd.getStringCellValue());
			driver.findElement(loc.os_login_button).click();
			Thread.sleep(5000);
			if (driver
					.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"))
					.size() > 0) {
				System.out.println("Given credential are in-valid***");
				res = "In-valid credential";
			} else {
				System.out.println("Given credential are valid***");
				res = "Valid credential";

<<<<<<< HEAD
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(loc.os_login_button).sendKeys(un.getStringCellValue());
		driver.findElement(loc.os_password_editbox).sendKeys(pswd.getStringCellValue());
		driver.findElement(loc.os_login_button).click();
		Thread.sleep(3000);
		if (driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).size() > 0) {
			System.out.println("Given credential are in-valid***");
			res = "In-valid credential";
		} else {
			System.out.println("Given credential are valid***");
			res = "Valid credential";
			
			// click ok in alert
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.linkText("Logout"));
			
			
		}
=======
				// click ok in alert
				// driver.switchTo().alert().accept();
				driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Logout")).click();

			}

			// Create a cell to send thetest results
			Cell results = r.createCell(2);
			results.setCellValue(res);
		} // for loop end

		FileOutputStream fo = new FileOutputStream(".\\src\\test\\resources\\testdata\\anusha.xlsx");
		w.write(fo);
		w.close();
>>>>>>> branch 'master' of https://github.com/anushaparuchuri/HybridFramework

	}

}
