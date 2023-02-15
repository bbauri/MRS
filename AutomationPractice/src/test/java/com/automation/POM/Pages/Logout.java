package com.automation.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy(partialLinkText = "Logout")
	private WebElement lgout=null;
	
	public Logout(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void lgout() {
		
		lgout.click();
		
	}

}
