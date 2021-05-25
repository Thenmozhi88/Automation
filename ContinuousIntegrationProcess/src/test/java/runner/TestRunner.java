package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "Feature",
		glue="stepDefinition",
				//format = {"pretty", "html:target/Destination"},
			//	plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Output/report.html"},
		format= {"json:target/cucumber.json"},
		dryRun=false
		
		
	)

public class TestRunner {

}
