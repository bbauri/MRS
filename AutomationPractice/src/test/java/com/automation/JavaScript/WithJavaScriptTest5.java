package com.automation.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithJavaScriptTest5 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/newpancard.php");
		
		//driver.findElement(By.partialLinkText("Apply New PAN Card")).click();
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.border='6px solid red'");
		((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.background='yellow'");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
