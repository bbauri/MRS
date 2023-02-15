package com.automation.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class SyncImplicitTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		driver.get("https://my.microfocus.com/");
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		WebElement emailfield = driver.findElement(By.id("username"));
		Thread.sleep(5000);

		emailfield.sendKeys("bhola.bauri@bb.com");
		Thread.sleep(5000);

		driver.quit();
	}

}
