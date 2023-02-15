package com.automation.POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.POM.Core.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_CreateRecord_1 extends POM_Script{
	
	
	
	@Test
	public void createRecord() throws Exception {
		
		
		
		
		//Login
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		
		//Register
		driver.findElement(By.partialLinkText("Register a patient")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("givenName")).sendKeys("DELHI");
		driver.findElement(By.name("familyName")).sendKeys("SIX");
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("gender-field")).sendKeys("Male");
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("birthdateDay-field")).sendKeys("12");
		driver.findElement(By.id("birthdateMonth-field")).sendKeys("June");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("1999");
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("address1")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("0001212");
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();
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
