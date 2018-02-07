package demo.cucumber;

import core.TC01;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class SearchGoogle {
	public Scenario scenario;
	@Before
	public void before(Scenario scenario) {
		this.scenario=scenario;
	}
	
	
  @Given("^Enter search term$")
  public void given() throws Throwable {
	  TC01 t = new TC01();

	  scenario.write("entered search text");
	  t.openwebpage();
	  t.entersearch();
  }

  @When("^Do search$")
  public void when() throws Throwable {

	  scenario.write("searched");
	  TC01 t = new TC01();
	  t.clickbutton();
  }

  @Then("^Results are shown for$")
  public void then() throws Throwable {
	  TC01 t = new TC01();
	  t.verify();
	  scenario.write("verified");
  }

}
