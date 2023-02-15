package com.automation.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		WebElement btnupload =  driver.findElement(By.id("file-upload"));
		btnupload.sendKeys("Z:\\ResumeTest.docx");
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
