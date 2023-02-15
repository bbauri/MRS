package com.automation.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTest {
	
	
	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		System.out.println("#Tables xpah:"+driver.findElements(By.xpath("//table")).size());
		System.out.println("Selected Table By id:"+driver.findElements(By.id("example")).size());
		System.out.println("#Tables TagName"+driver.findElements(By.tagName("table")).size());
		System.out.println("#Tables cssSelector"+driver.findElements(By.cssSelector("table")).size());
		System.out.println("Total Rows on Current Table:"+driver.findElements(By.xpath("//table[@id='example']//tr")).size());
		System.out.println("Total Rows Inside Body of Table:"+driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size());
		System.out.println("Total Columns In Table:"+driver.findElements(By.xpath("//table[@id='example']//thead//th")).size());
		
		WebElement table =  driver.findElement(By.id("example"));
		
		System.out.println(" "+table.getText());
		
		WebElement row =  driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)[3]"));
		
		
		System.out.println(" ");
		
		System.out.println("3rd Row Data:"+row.getText());
		//row data
		row =  driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)[5]"));
		System.out.println("5th Row Data:"+row.getText());
		
		//cell data
		row =  driver.findElement(By.xpath("((//table[@id='example']//tbody//tr)[3]//td)[6]"));
		
		System.out.println(row.getText());
		
		row = driver.findElement(By.xpath("((//table[@id='example']//tbody//tr)[7]//td)[6]"));
		
		System.out.println(row.getText());
		
		
		Thread.sleep(1000);
		driver.quit();

	}

}
