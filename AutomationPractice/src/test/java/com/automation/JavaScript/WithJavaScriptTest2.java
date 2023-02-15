package com.automation.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithJavaScriptTest2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		WebElement btnclick = driver.findElement(By.id("searchBtn"));
		
		//((JavascriptExecutor)driver).executeScript("document.getElementById('searchBtn').click()");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", btnclick);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
