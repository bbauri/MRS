package com.automation.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutJavaScriptTest1 {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://emicalculator.net/");
		
		WebElement txtloanint =  driver.findElement(By.id("loaninterest"));
		
		//txtloanint.sendKeys("12.0");
		
		txtloanint.clear();
		Actions act = new Actions(driver);
	
		act.sendKeys(txtloanint, "13.5").build().perform();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
