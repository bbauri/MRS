package com.automation.JavaScript;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithJavaScriptTest3 {

	public static void main(String[] args) throws IOException, Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		WebElement table = driver.findElement(By.id("example"));
		
		//((JavascriptExecutor)driver).executeScript("document.getElementById('example').scrollIntoView()");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",table);
		
		File src = table.getScreenshotAs(OutputType.FILE);
		
		File dest =  new File("Z:\\test.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		 
		Thread.sleep(2000);
		driver.quit();
	}

}
