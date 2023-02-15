package com.automation.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutTestNGAddToCart {

	public static void main(String[] args) throws Exception {
		
		//Open_Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		
		//Login
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		//AddTOCart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		
		Thread.sleep(1000);
		//Logout
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		//Close_Browser
		Thread.sleep(2000);
		driver.quit();
		
	}

}
