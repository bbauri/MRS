package com.automation.KeyWordDrivenFramework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.Frameworks.Helper.ExcelHelper;
import com.automation.KeyWordDrivenFramework.ProjectHelper.ProjectHelper;

public class DriverScript_3 extends FrameworkScript {
	
	@Test(dataProvider = "getTestData")
	public void execute(String tcname, String setpname,String action,String properties, String data) {
		
		//System.out.println(tcname +"\t"+ setpname +"\t"+ action+"\t"+ properties+"\t"+data );
		
		WebElement we=null;
		//FineElement
		we =  ProjectHelper.findElement(driver,properties);
		
		//Action
		ProjectHelper.executeAction(driver,we, action, data);
	}
		
		@DataProvider(name="getTestData")
		public Object[][] getTestData()throws Exception{

			return ExcelHelper.getTestData("Z:\\MindQ\\Automation Testing\\KeywordDriven.xlsx", "Sheet1");
		}

}
