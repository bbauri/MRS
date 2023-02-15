package com.automation.TestNG_Assertions.HardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript2 {
	
	private WebDriver driver = null;
	@Test
	public void verifselection() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		
		Assert.assertNull(driver);
		
		driver = new ChromeDriver();
		
		Assert.assertNotNull(driver);
		
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/newpancard.php");
		
		boolean actualvalue=driver.findElement(By.id("rblCategory_0")).isSelected();
		
		Assert.assertFalse(actualvalue);
		
		Thread.sleep(1000);
		driver.quit();
	}
	 
	
}
