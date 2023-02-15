package com.automation.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class RegisterPage {
	
	@FindBy(partialLinkText  ="Register a patient")
	private WebElement lnkregister=null;
	
	@FindBy(name  ="givenName")
	private WebElement fname=null;
	
	@FindBy(name  ="familyName")
	private WebElement lname=null;
	
	@FindBy(id  ="next-button")
	private WebElement nbtn=null;
	
	@FindBy(id  ="gender-field")
	private WebElement gen=null;
	
	@FindBy(id  ="birthdateDay-field")
	private WebElement date=null;
	
	@FindBy(id  ="birthdateMonth-field")
	private WebElement month=null;
	
	@FindBy(id  ="birthdateYear-field")
	private WebElement year=null;
	
	@FindBy(id  ="address1")
	private WebElement add=null;
	
	@FindBy(name  ="phoneNumber")
	private WebElement mnumber=null;
	
	@FindBy(id  ="submit")
	private WebElement btnsubmit=null;
	
	@FindBy(xpath ="//em[text()='Patient ID']/../span")
	private WebElement we=null;
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void createRecord(String fn, String ln, String gens, String dates, String mons,
			String years, String adds, String mobile) throws Exception {
		
		lnkregister.click();
		Thread.sleep(1000);
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		nbtn.click();
		gen.sendKeys(gens);
		nbtn.click();
		date.sendKeys(dates);
		month.sendKeys(mons);
		year.sendKeys(years);
		nbtn.click();
		add.sendKeys(adds);
		nbtn.click();
		mnumber.sendKeys(mobile);
		nbtn.click();
		nbtn.click();
		btnsubmit.click();
		
		String id = we.getText();
		Reporter.log(id);
		Assert.assertNotNull(id);
		Thread.sleep(10000);
		
	}
	
	
}
