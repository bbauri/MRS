package com.automation.Windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTest2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		driver.get("https://www.cypress.io/");
		driver.findElement(By.partialLinkText("Log In")).click();
		
		Set<String> set = driver.getWindowHandles();
		
		for(String wid:set) {
			if(driver.switchTo().window(wid).getTitle().equals("Cypress.io"))
			break;
		}
		
		driver.findElement(By.xpath("(//span[@class='pull-left'])[4]")).click();
		driver.findElement(By.id("email")).sendKeys("bhola.bauri@bb.com");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
