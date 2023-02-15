package com.automation.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features="src\\test\\resources\\features\\HRM.feature",name="Login",plugin= {"html:ExecutionReports.html"})
//@CucumberOptions(features="src\\test\\resources\\features\\HRM.feature",name="Parameters",plugin= {"html:ExecutionReports.html"})
@CucumberOptions(features="src\\test\\resources\\features\\HRM.feature",plugin= {"html:ExecutionReports.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
