package com.automation.Condition_Statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class IfConditionTest {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		String input="chrome";
		//String input="firefox";
				
				if(input.equals("chrome")) {
					
					System.out.println("chrome Browser Eexecution");
					
					WebDriverManager.chromedriver().setup();
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://facebook.com");
					
					driver.quit();
				}
		
		System.out.println("End");

	}

}
