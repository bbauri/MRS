package com.automation.Frameworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.Frameworks.Core.FrameworkScript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_CreateRecord2 extends FrameworkScript {
	
	@DataProvider(name="getTestData")
	private Object[][] getTestData() {
		
		String [][]data=new String[2][14];
		
		data[0][0]="Admin";
		data[0][1]="Admin123";
		data[0][2]="MindyS";
		data[0][3]="Mink";
		data[0][4]="Female";
		data[0][5]="20";
		data[0][6]="December";
		data[0][7]="1980";
		data[0][8]="FLORIDA";
		data[0][9]="USA";
		data[0][10]="10001";
		data[0][11]="9898989898";
		data[0][12]="Doctor";
		data[0][13]="Tom";
		
		//2nddataset
		data[1][0]="Admin";
		data[1][1]="Admin123";
		data[1][2]="MindyS";
		data[1][3]="MinkS";
		data[1][4]="Female";
		data[1][5]="20";
		data[1][6]="December";
		data[1][7]="1980";
		data[1][8]="FLORIDA";
		data[1][9]="USA";
		data[1][10]="10001";
		data[1][11]="9898989898";
		data[1][12]="Doctor";
		data[1][13]="Tom";
		        
		        /*String[][]
				
				data= {

				{"Admin","Admin123","Mindy","Mink","Female","20","December","1980","FLORIDA","USA","10001","9898989898","Doctor","Tom"},
				{"Admin","Admin123","Meddy","Mink","Female","20","December","1980","FLORIDA","USA","10001","9898989898","Doctor","Tom"}
	};*/
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void createRecord(String un, String pw,String fn, String ln,String gen,String date,String mon,String year,String add, String country, String pin,String mobile, String relation1, String relation2 ) throws Exception {
		
		
		
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
