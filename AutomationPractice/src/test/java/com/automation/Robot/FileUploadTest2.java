package com.automation.Robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest2 {

	public static void main(String[] args) throws Exception {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		WebElement btnupload =  driver.findElement(By.id("file-upload"));
		
		Actions act = new Actions(driver);
		act.click(btnupload).build().perform();
		
		Thread.sleep(3000);
		
		StringSelection ss = new StringSelection("Z:\\ResumeTest.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.quit();

	}

}
