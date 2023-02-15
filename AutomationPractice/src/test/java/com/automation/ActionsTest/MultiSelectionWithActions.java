package com.automation.ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionWithActions {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).perform();
				
		act.click(driver.findElement(By.xpath("//option[text()='Volvo']"))).perform();
		
		Thread.sleep(2000);
		
		act.click(driver.findElement(By.xpath("//option[text()='Audi']"))).perform();
		
		act.keyUp(Keys.CONTROL).perform();
		
		
		Thread.sleep(2000);
		driver.quit();
	

	}

}
