package com.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.Frameworks.Helper.ExcelHelper;
import com.automation.POM.Core.POM_Script;
import com.automation.POM.Pages.LoginPage;
import com.automation.POM.Pages.Logout;
import com.automation.POM.Pages.RegisterPage;

public class TC_001_CreateRecord_2 extends POM_Script {

	@Test(dataProvider = "getTestData")
	public void createRecord(String uname, String pass, String fn, String ln, String gens, String dates, String mons,
			String years, String adds, String mobile) throws Exception {

		// Login
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		LoginPage LP = new LoginPage(driver);
		LP.login(uname,pass);
		Thread.sleep(1000);

		// Register
		RegisterPage rp = new RegisterPage(driver);
		rp.createRecord(fn,ln,gens,dates,mons,years,adds,mobile);

		// Logout
		Logout lg=new Logout(driver);
		lg.lgout();
	}
	
		@DataProvider(name="getTestData")
		public Object[][] getTestData()throws Exception{

			return ExcelHelper.getTestData("Z:\\MindQ\\Automation Testing\\TestData.xlsx", "Sheet1");
			
	}
	

}
