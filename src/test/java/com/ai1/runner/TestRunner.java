package com.ai1.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resource/features", // Adjust this path if your features are elsewhere
	    glue = {"com.ai1.stepdefinitions"},       // Adjust this if your glue code is in a different package
	    tags = "@SanityCheck1235",                // Change or remove as needed
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports/cucumber-pretty.html",
	        "html:target/cucumber-reports/cucumber.html",
	        "json:target/cucumber-reports/CucumberTestReport.json",
	        "rerun:target/cucumber-reports/failed_scenarios.txt",
	        "timeline:target/cucumber-reports",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    },
	    monochrome = true
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
	    @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}