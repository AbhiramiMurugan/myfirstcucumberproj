package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//vigne//eclipse-workspace//TestNgDemo//cucumbersample//src//test//resources//login.feature", glue = {
		"stepDefinition" }, monochrome = true, dryRun = false
// tags = "@SmokeTest"
)

public class TestRunner {

}
