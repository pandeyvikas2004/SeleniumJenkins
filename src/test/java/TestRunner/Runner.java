package TestRunner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Features"},glue = {"StepDefinitions"},
//plugin = { "pretty","html:target/cucumber-reports","json:target/cucumber-reports/cucumber.json" },
plugin =  {"json:target/cucumber.json"},
monochrome = true)
public class Runner {
	
}
