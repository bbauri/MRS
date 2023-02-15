package com.automation.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SyncExplicitTest2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		
		driver.findElement(By.partialLinkText("Sign up")).click();
		
		WebDriverWait wbw = new WebDriverWait(driver, Duration.ofMinutes(5));
		wbw.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		WebElement wbl = driver.findElement(By.id("email"));
		wbl.sendKeys("bhola.bauri@bb.com");
		
		Thread.sleep(5000);
		driver.quit();

		

	}

}
