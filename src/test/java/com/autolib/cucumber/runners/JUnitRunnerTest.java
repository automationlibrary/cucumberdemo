package com.autolib.cucumber.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.autolib.cucumber.stepdefs", features = "src/test/resources/features")
public class JUnitRunnerTest {

}
