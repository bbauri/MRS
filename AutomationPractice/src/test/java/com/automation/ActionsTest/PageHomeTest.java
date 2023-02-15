package com.automation.ActionsTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageHomeTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.END).perform();
		
		act.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
