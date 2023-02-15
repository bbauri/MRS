package com.automation.ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTestClick {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.timesjobs.com/");
		
		WebElement btnupload = driver.findElement(By.id("resumeFile_basic"));
		
		Actions actions = new Actions(driver);
		
		actions.click(btnupload).perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
