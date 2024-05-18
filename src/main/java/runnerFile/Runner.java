package runnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "Features",
	glue = "stepDefinitions",
	plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
)

public class Runner extends AbstractTestNGCucumberTests{

}
