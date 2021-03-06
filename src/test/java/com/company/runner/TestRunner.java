package com.company.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/company/features", glue = "com.company.steps", plugin = {"json:target/cucumber.json"})
public class TestRunner {
}
