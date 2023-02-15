package com.automation.Cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	
	private WebDriver driver=null;
	
	
	@Before
	public void openbrowser() {
	    
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	@BeforeStep
	public void login() {
	    
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	}

	@When("PIM")
	
	public void pim() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("PIM")).click();
	}

	@When("AddEmployee")
	
	public void add_employee() throws Exception {
		driver.findElement(By.partialLinkText("Add Employee")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Bhola");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Bauri");
		   
	}

	@When("Save")
	public void save() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	
	@AfterStep
	public void click_on_logout() {
		driver.findElement(By.linkText("Maxim Fomin")).click();
		driver.findElement(By.linkText("Logout"));
	}

	
	@After
	public void close_the_browser() throws Exception {
		Thread.sleep(2000);
	    driver.quit();
	}

	@When("Search")
	public void search() throws Exception {
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Bhola");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("EditEmployee")
	public void edit_employee() {
		
	}

	

	@Then("DeleteEmployee")
	public void delete_employee() throws Exception {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(2000);
	}

}
