package com.automation.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class WithTestNGAddToCart3 {

	private WebDriver driver = null;

	// Open_Browser
	@BeforeTest
	public void OpenBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
	}
	// Login
	@BeforeMethod
	public void login() {
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	
	@Test(invocationCount = 1)
	public void AddToCart() throws Exception {

		
		Thread.sleep(1000);
		// AddTOCart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		Thread.sleep(1000);
		
	}
	// Logout
	@AfterMethod
	public void logout() throws Exception {
		
		
				driver.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("logout_sidebar_link")).click();

	}

	@AfterTest
	public void CloseBrowser() throws Exception {
		// Close_Browser
		Thread.sleep(2000);
		driver.quit();
	}

}
