package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersTest {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.apsrtconline.in/oprs-web/");
		
		//driver.findElement(By.id("searchBtn")).click();
		
		//driver.findElement(By.name("searchBtn")).click();
		
		//driver.findElement(By.className("chkavailabilityBtn")).click();
		
		//driver.findElement(By.xpath("/html/body/div[4]/div/form/div[1]/div/div[1]/input[9]")).click();
		
		//driver.findElement(By.xpath("//input[@type='button']")).click();
		
		//driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
		
		//driver.findElement(By.xpath("	//input[@title='Search']")).click();
		
		//driver.findElement(By.xpath("	//input[@id='searchBtn']")).click();
		
		//driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		
		//driver.findElement(By.xpath("//input[@class='chkavailabilityBtn']")).click();
		
		//driver.findElement(By.cssSelector("input[type='button']")).click();
		
		//driver.findElement(By.cssSelector("input[value='Check Availability']")).click();
		
		//driver.findElement(By.cssSelector("input[title='Search']")).click();
		
		//driver.findElement(By.cssSelector("input[id='searchBtn']")).click();
		
		//driver.findElement(By.cssSelector("input[name='searchBtn']")).click();
		
		//driver.findElement(By.cssSelector("input[class='chkavailabilityBtn']")).click();
		
		
		driver.get("https://www.thepancard.com/");
		
		//driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		driver.findElement(By.partialLinkText("Apply New PAN Card")).click();
		
		
		Thread.sleep(1000);
		driver.quit();
		
		

	}

}
