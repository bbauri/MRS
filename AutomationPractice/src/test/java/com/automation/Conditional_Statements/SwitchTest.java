package com.automation.condition_statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTest {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		
		String  input = "edge";
		
		switch (input) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			break;
		case "edge":
			
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.get("http://myntra.com");
		driver.quit();

	}

}
