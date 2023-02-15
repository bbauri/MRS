package com.automation.Loop_Statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhileTest {

	public static void main(String[] args) {
		
		String input="chrome";
		//boolean status=true;
		
		while(input.equals("chrome")) {
		//while(status) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://myntra.com");
			driver.quit();
			input="firefox";
			
		}
		System.out.println("Input type has changed");
	}

}
