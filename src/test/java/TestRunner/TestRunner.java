package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features=".//FeatureFiles/",
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"},
		tags= {"@sanity, @regression"}
	
		
		)
public class TestRunner {

}
