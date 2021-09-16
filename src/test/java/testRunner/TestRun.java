package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/customers.feature",
		glue="stepDefinition",
		dryRun=false,
		monochrome=false,
		plugin= {"pretty","html:test-output"}
		)
public class TestRun {

}
