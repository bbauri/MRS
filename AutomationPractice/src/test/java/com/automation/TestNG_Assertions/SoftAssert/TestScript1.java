package com.automation.TestNG_Assertions.SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript1 {
	
	
	SoftAssert sa=new SoftAssert();

	private WebDriver driver = null;
	@Test
	public void verifytitle() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		
		Assert.assertNull(driver);
		
		driver = new ChromeDriver();
		
		Assert.assertNotNull(driver);
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String expectedvalue="Google";
		String actualvalue= driver.getTitle();
		
		sa.assertEquals(expectedvalue, actualvalue);
		
		Thread.sleep(1000);
		driver.quit();
		sa.assertAll();
}
}