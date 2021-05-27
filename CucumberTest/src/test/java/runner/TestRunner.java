package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Feature",
		glue="stepDefinition",
		//plugin = { "pretty","html:target/cucumber-html-report",
			//	        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
				//        "junit:target/cucumber.xml","rerun:target/rerun.txt" }
		plugin= {"pretty","json:target/cucumber/product.json","html:target/cucumber"}
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
