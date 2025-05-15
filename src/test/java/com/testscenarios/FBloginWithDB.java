package com.testscenarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class FBloginWithDB extends CommonFunctions {
	public Connection cnn;
	public Statement stmt;
	public ResultSet rs;
	public String un;
	public String pwsd;

	@Test
	public void fbloginUsingDB() throws Exception {

		// Connect the DB
		String databaseURL = "jdbc:mysql://127.0.0.1:3306/658_batchdemo";
		String databaseUN = "root";
		String databasePWD = "admin@123";
		Class.forName("com.mysql.cj.jdbc.Driver"); // oracle.jdbc.driver.OracleDriver
		cnn = DriverManager.getConnection(databaseURL, databaseUN, databasePWD);

		// write a sql query
		// String myQry = "select * from FB_User_Details;";
		String myQry = "SELECT * FROM fb_user_details where fb_UN = 'Venkat@GMAIL.COM';";
		stmt = cnn.createStatement();
		// run hte SQL query
		rs = stmt.executeQuery(myQry);
		while (rs.next()) {
			un = rs.getString(1);
			pwsd = rs.getString(2);
		}
		cnn.close();

		chromeBrowserLaunch();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(loc.fbLogin_Email_Editbox).clear();
		driver.findElement(loc.fbLogin_Email_Editbox).sendKeys(un);
		driver.findElement(loc.fbLogin_Password_Editbox).sendKeys(pwsd);
		driver.findElement(loc.fbLogin_Login_Button).click();
		Thread.sleep(6000);

	}

}
