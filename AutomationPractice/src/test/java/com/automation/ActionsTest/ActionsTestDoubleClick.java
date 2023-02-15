package com.automation.ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTestDoubleClick {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(0);
		
		WebElement dblelement = driver.findElement(By.tagName("div"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(dblelement).build().perform();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
