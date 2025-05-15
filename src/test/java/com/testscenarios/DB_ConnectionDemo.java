package com.testscenarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class DB_ConnectionDemo extends CommonFunctions {
	public WebDriver driver;

	public Connection cnn;
	public Statement stmt;
	public ResultSet rs;

	@Test
	public void f() throws Exception {
		// Connect the DB
		String databaseURL = "jdbc:mysql://127.0.0.1:3306/658_batchdemo";
		String databaseUN = "root";
		String databasePWD = "admin@123";

		Class.forName("com.mysql.cj.jdbc.Driver"); //oracle.jdbc.driver.OracleDriver
		cnn = DriverManager.getConnection(databaseURL, databaseUN, databasePWD);

		// write a sql query
		// String myQry = "select * from FB_User_Details;";
		String myQry = "SELECT * FROM STUDENTS where STU_NAME = 'hema';";
		stmt = cnn.createStatement();

		// run hte SQL query
		rs = stmt.executeQuery(myQry);

		// to print the results will use While loop
		while (rs.next()) {
//			String un = rs.getString(1);
//			String pwd = rs.getString(2);
//			System.out.println(un+"\t"+pwd);
			String STU_NO = rs.getString(1);
			String STU_NAME = rs.getString(2);
			String STU_MAILID = rs.getString(3);
			String STU_ADDRESS = rs.getString(4);
			String STU_CITY = rs.getString(5);
			String STU_COUNTRY = rs.getString(6);
			String STU_AGE = rs.getString(7);

			System.out.println(STU_NO + "\t" + STU_NAME + "\t" + STU_MAILID + "\t" + STU_ADDRESS + "\t" + STU_CITY
					+ "\t" + STU_COUNTRY + "\t" + STU_AGE);
		}

		// Close the DB connection
		cnn.close();

	}
	
	
}
