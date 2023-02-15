package com.automation.ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementTest {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dtdc.in/");
		
		WebElement lnktrack = driver.findElement(By.linkText("Tracking"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(lnktrack).build().perform();
		
		WebElement etrack = driver.findElement(By.partialLinkText("E-Tracker"));
		
		Actions actions1 = new Actions(driver);
		
		actions1.click(etrack).build().perform();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
