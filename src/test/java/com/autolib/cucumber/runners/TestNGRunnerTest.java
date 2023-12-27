package com.autolib.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "com.autolib.cucumber.stepdefs", features = "src/test/resources/features", tags = "@global_navigation")
public class TestNGRunnerTest extends AbstractTestNGCucumberTests{

}
