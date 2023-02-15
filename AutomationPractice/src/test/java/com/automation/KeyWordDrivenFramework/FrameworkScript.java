package com.automation.KeyWordDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkScript {

protected WebDriver driver= null;
	
	//open browser
	@org.testng.annotations.Parameters({"Browser"})
	@BeforeTest
	public void OpenBrowsrer(String browser) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		
		}
		
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
				driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
				driver.manage().window().maximize();
				//driver.get("https://demo.openmrs.org/openmrs/login.htm");
				driver.get("https://www.thepancard.com/");
		
	}
	//close browser
		@AfterTest
		public void CloseBrowsr() {
			
			
			driver.quit();
			
		}
}
