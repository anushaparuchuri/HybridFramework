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
}
