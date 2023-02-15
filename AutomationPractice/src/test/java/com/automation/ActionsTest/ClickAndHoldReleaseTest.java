package com.automation.ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHoldReleaseTest {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement hold = driver.findElement(By.id("draggable"));
		
		WebElement release = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(hold).release(release).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
