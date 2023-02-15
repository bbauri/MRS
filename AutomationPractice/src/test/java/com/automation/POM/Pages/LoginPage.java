package com.automation.POM.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement txtname=null;
	
	@FindBy(id="password")
	private WebElement txtpassword=null;
	
	@FindBy(id="Registration Desk")
	private WebElement lnkdesk=null;
	
	@FindBy(id="loginButton")
	private WebElement loginbtn=null;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname, String passowrd) {
	
		txtname.sendKeys(uname);
		txtpassword.sendKeys(passowrd);
		lnkdesk.click();
		loginbtn.click();
	}
	
}
