package com.automation.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithJavaScriptTest1 {

	public static void main(String[] args) throws Exception {
	
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://emicalculator.net/");
		
		WebElement txtloanint = driver.findElement(By.id("loaninterest"));
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('loaninterest').value='13.5'");
		
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].value='14.5'",txtloanint);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
