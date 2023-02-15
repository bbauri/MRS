package com.automation.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\features\\HRM2.feature",plugin={"html:ExecutionReports.html"})
public class TestRunner2 extends AbstractTestNGCucumberTests{

}
