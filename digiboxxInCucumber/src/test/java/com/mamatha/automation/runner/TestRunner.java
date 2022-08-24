package com.mamatha.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.mamatha.automation.stepdef", "com.mamatha.automation.base" }, features = {
		"Features/" }, plugin = { "pretty", "rerun:target/rerun/failedRerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true)

public class TestRunner {

}
