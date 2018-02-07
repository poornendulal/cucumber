package demo.cucumber;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefs" }, tags = { "~@Ignore" }, format = {
		"pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" })
public class TestNGRunner {
	@Test
	public void f() {

	}
}
