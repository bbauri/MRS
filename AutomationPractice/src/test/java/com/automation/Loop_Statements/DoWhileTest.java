package com.automation.Loop_Statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoWhileTest {

	public static void main(String[] args) {
		
		String input = "firefox";
		
		do {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://myntra.com");
			driver.quit();
		}
		while(input.equals("chrome"));
		
		
				
			
			System.out.println("Input type has changed");
	}
	
}
