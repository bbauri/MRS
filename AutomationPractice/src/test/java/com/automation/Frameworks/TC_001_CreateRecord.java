package com.automation.Frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.Frameworks.Core.FrameworkScript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_CreateRecord extends FrameworkScript {
	
	@DataProvider(name="getTestData")
	private Object[][] getTestData() throws Exception {
		
		File file = new File("Z:\\MindQ\\Automation Testing\\TestData.xlsx");
		FileInputStream ip= new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(ip);
		Sheet sheet=wb.getSheet("Sheet1");
		
		String [][]data=new String[2][14];
		
		data[0][0]=sheet.getRow(0).getCell(0).toString();
		data[0][1]=sheet.getRow(0).getCell(1).toString();
		data[0][2]=sheet.getRow(0).getCell(2).toString();
		data[0][3]=sheet.getRow(0).getCell(3).toString();
		data[0][4]=sheet.getRow(0).getCell(4).toString();
		data[0][5]=sheet.getRow(0).getCell(5).toString();
		data[0][6]=sheet.getRow(0).getCell(6).toString();
		data[0][7]=sheet.getRow(0).getCell(7).toString();
		data[0][8]=sheet.getRow(0).getCell(8).toString();
		data[0][9]=sheet.getRow(0).getCell(9).toString();
		data[0][10]=sheet.getRow(0).getCell(10).toString();
		data[0][11]=sheet.getRow(0).getCell(11).toString();
		data[0][12]=sheet.getRow(0).getCell(12).toString();
		data[0][13]=sheet.getRow(0).getCell(13).toString();
		
		//2nddataset
				data[1][0]=sheet.getRow(1).getCell(0).toString();
				data[1][1]=sheet.getRow(1).getCell(1).toString();
				data[1][2]=sheet.getRow(1).getCell(2).toString();
				data[1][3]=sheet.getRow(1).getCell(3).toString();
				data[1][4]=sheet.getRow(1).getCell(4).toString();
				data[1][5]=sheet.getRow(1).getCell(5).toString();
				data[1][6]=sheet.getRow(1).getCell(6).toString();
				data[1][7]=sheet.getRow(1).getCell(7).toString();
				data[1][8]=sheet.getRow(1).getCell(8).toString();
				data[1][9]=sheet.getRow(1).getCell(9).toString();
				data[1][10]=sheet.getRow(1).getCell(10).toString();
				data[1][11]=sheet.getRow(1).getCell(11).toString();
				data[1][12]=sheet.getRow(1).getCell(12).toString();
				data[1][13]=sheet.getRow(1).getCell(13).toString();
		return data;
	}

	
	@Test(dataProvider = "getTestData")
	public void createRecord(String un, String pw,String fn, String ln,String gen,String date,String mon,String year,String add, String country, String pin,String mobile, String relation1, String relation2) throws Exception {
		
		
		
		//login
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		
		//Registration
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
		Thread.sleep(10000);
		
		//Logout
		driver.findElement(By.partialLinkText("Logout")).click();
		
		
	}
	

}
