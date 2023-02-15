package com.automation.ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSelectionTestUsingMouse {

	public static void main(String[] args) throws Exception {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		WebElement autoselect = driver.findElement(By.id("fromPlaceName"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(autoselect,"Hyderabad").perform();
		Thread.sleep(2000);
		
		WebElement lnktxt = driver.findElement(By.partialLinkText("HYDERABAD-AIRPORT-RGIA-PICKUP POINT-D"));
		
		act.click(lnktxt).perform();
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
