package com.automation.TestNG_Parametrization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Test {
	
	private WebDriver driver = null;
	@org.testng.annotations.Parameters({"browser"})
	@org.testng.annotations.Test
	public void TC1(String browser) throws Exception{
		
		switch (browser) {
		case "chrome":
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;

		
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	

}
