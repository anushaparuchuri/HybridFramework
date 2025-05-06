package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {

	// Pagename_ElelemntName+ElementType
	public final By fbLogin_Email_Editbox = By.name("email");
	public final By fbLogin_Password_Editbox = By.id("pass");
	public final By fbLogin_Login_Button = By.name("login");

	// Locators for podfoods.co
	public final By podfoods_Login_Button1 = By.xpath("//*[@class='el-button el-button--ghost']");
	public final By podfoods_Email_Editbox = By.name("email");
	public final By podfoods_Password_Editbox = By.name("password");
	public final By podfoods_Login_Button2 = By.xpath("//button[@type='button']");

	// Locators for automationexercise
	public final By ae_Login_email_editbox = By.name("email");
	public final By ae_Login_password_editbox = By.name("password");
	public final By ae_Login_button = By.xpath("//button[@data-qa='login-button']");
	public final By ae_Login_UserNameLink = By.partialLinkText("Sreeni");
	public final By ae_Login_LogoutLink = By.partialLinkText("Logout");

	// Locators for Opensource demo
	public final By os_Username_editbox = By.name("username");
	public final By os_password_editbox = By.name("password");
	public final By os_login_button = By
			.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

}
