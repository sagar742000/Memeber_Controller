package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".//src//test//java"},
		glue = "stepdefinition",
		tags = "@Putclub",
		dryRun = false,
		monochrome = true,
		plugin = {
				"pretty"
		}
		)
public class Runner_ClubSpark extends AbstractTestNGCucumberTests{

}
