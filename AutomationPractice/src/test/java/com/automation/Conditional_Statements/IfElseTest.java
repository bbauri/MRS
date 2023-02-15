package com.automation.Conditional_Statements;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfElseTest {

	public static void main(String[] args) throws Exception {
		
		/*String input= "chrome";
		
		if(input.equals("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://facebook.com");
			
			driver.quit();
		}else {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver1 = new ChromeDriver();
			
			driver1.manage().window().maximize();
			
			driver1.get("http://amazon.com");
			
			driver1.quit();*/
		
		WebDriver driver=null;
		
		String input = "chrome";
		
		if(input.equals("firefox")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		

	}else {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
		driver.manage().window().maximize();
		driver.get("http://myntra.com");
		driver.quit();
		
		System.in.read();
}}
