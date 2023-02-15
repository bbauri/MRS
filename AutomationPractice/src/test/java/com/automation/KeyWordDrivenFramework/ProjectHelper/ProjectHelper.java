package com.automation.KeyWordDrivenFramework.ProjectHelper;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProjectHelper {
	
	
	public static WebElement findElement(WebDriver driver,String properties) {
		
		WebElement we=null;
		if(ObjectUtils.isNotEmpty(properties)) {

			String loctorType=properties.split("=")[0];
			String locatorValue=properties.split("=")[1];
			
			switch (loctorType) {
			case "id":
				we=driver.findElement(By.id(locatorValue));
				break;
			case "name":
				we=driver.findElement(By.name(locatorValue));
				break;
			case "className":
				we=driver.findElement(By.className(locatorValue));
				break;
			case "tagName":
				we=driver.findElement(By.tagName(locatorValue));
				break;
			case "xpath":
				we=driver.findElement(By.xpath(locatorValue));
				break;
			case "cssSelector":
				we=driver.findElement(By.cssSelector(locatorValue));
				break;
			case "partialLinkText":
				we=driver.findElement(By.partialLinkText(locatorValue));
				break;
			case "linkText":
				we=driver.findElement(By.linkText(locatorValue));
				break;
			}
		}
		return we;
		
	}
	public static void executeAction(WebDriver driver, WebElement we,String action, String data) {
		
		Actions ac=null;
		switch (action) {
		case "visit":
			driver.get(data);
			break;
		case "setValue":
			we.sendKeys(data);
			break;
		case "click":
			we.click();
			break;
		case "doubleclick":
			ac=new Actions(driver);
			ac.doubleClick(we);
			break;
		case "rightclick":
			ac=new Actions(driver);
			ac.contextClick(we).build().perform();
			break;
			
		case "selectByText":
			Select se=new Select(we);
			se.deselectByVisibleText(data);
			break;

		case "back":
			driver.navigate().back();
			break;
			
		case "forward":
			driver.navigate().forward();
			break;
		case "refresh":
			driver.navigate().refresh();
			break;

		}
	}

}
