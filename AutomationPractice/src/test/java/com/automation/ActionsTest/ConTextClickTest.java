package com.automation.ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConTextClickTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement righclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(righclick).perform();
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
