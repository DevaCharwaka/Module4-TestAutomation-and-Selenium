package com.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ACER\\eclipse-workspace\\Module4TestAutomation\\src\\main\\java\\feature\\Test.feature", glue = {
		"stepDefination" })

public class TestRunner {

}
