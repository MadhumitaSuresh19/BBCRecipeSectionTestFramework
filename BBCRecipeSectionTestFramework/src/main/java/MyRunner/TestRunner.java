package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features  = "C:\\Users\\ARSHO\\eclipse-workspace\\LoginTestCucumberFramework\\src\\main\\java\\Features\\recipe.feature",//path of the feature
		//glue= {"stepDefinitions"},//path of the step definition file
		glue = {"stepDefinitions"},
		dryRun = false,//checks the mapping btw feature file and step definition file
		monochrome = true,//to display the console output in a readable format
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },//to generate different type of report file
		strict = true, //to check if any step is not defined inside step definition
		format= {"pretty","html:test-outout"}
		)

public class TestRunner {

}
