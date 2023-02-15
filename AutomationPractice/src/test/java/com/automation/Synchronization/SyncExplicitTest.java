package com.automation.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SyncExplicitTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://my.microfocus.com/");
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		WebDriverWait wbw = new WebDriverWait(driver, Duration.ofMinutes(5));
		wbw.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
		WebElement webeml = driver.findElement(By.id("username"));
		webeml.sendKeys("bhola.bauri@bb.com");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
