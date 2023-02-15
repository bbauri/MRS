package com.automation.JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithJavaScriptTest4 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		
		jse.executeScript("document.location='https://facebook.com'");
		
		System.out.println(jse.executeScript("return document.URL"));
		System.out.println(jse.executeScript("return document.title"));
		
		jse.executeScript("history.back()");
		Thread.sleep(2000);
		jse.executeAsyncScript("history.forward()");
		driver.quit();
			
	}

}
