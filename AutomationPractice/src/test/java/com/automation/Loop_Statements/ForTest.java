package com.automation.Loop_Statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForTest {

	public static void main(String[] args) {
		
		
		
		for(int index=1;index<=3;index++) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://facebook.com");	
			driver.quit();
		}
		System.out.println("Index is >=3 so for loop ended.");
	}

}
