package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;

import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"StepDefinition"})
public class Runner {
	
}

