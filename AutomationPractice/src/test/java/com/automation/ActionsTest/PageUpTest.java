package com.automation.ActionsTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class PageUpTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
