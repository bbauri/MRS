package com.automation.Frameworks;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.Frameworks.Core.FrameworkScript;
import com.automation.Frameworks.Helper.ExcelHelper;

public class TC_001_CreateRecord4 extends FrameworkScript {

	@DataProvider(name="getTestData")
	public Object[][] getTestData()throws Exception{

		return ExcelHelper.getTestData("Z:\\MindQ\\Automation Testing\\TestData.xlsx", "Sheet1");
}
	

	@Test(dataProvider = "getTestData")
	public void createRecord(String un, String pw, String fn, String ln, String gen, String date, String mon,
			String year, String add, String country, String pin, String mobile, String relation1, String relation2)
			throws Exception {

		// login
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		// Registration
		driver.findElement(By.partialLinkText("Register a patient")).click();
		driver.findElement(By.name("givenName")).sendKeys(fn);
		driver.findElement(By.name("familyName")).sendKeys(ln);
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();

		driver.findElement(By.id("gender-field")).sendKeys(gen);
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();

		driver.findElement(By.id("birthdateDay-field")).sendKeys(date);
		driver.findElement(By.name("birthdateMonth")).sendKeys(mon);
		driver.findElement(By.name("birthdateYear")).sendKeys(year);
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();

		driver.findElement(By.id("address1")).sendKeys(add);
		driver.findElement(By.id("country")).sendKeys(country);
		driver.findElement(By.id("postalCode")).sendKeys(pin);
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();

		driver.findElement(By.name("phoneNumber")).sendKeys(mobile);
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();

		driver.findElement(By.name("relationship_type")).sendKeys(relation1);
		driver.findElement(By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]")).sendKeys(relation2);
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();

		WebElement we = driver.findElement(By.xpath("//em[text()='Patient ID']/../span"));
		String id = we.getText();
		Reporter.log(id);
		Assert.assertNotNull(id);
		Thread.sleep(1000);

		// Logout
		driver.findElement(By.partialLinkText("Logout")).click();

	}
}
