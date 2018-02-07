package demo.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class SearchGoogle {
  @Given("^Enter search term 'Cucumber'$")
  public void given() throws Throwable {
	  System.out.println("Enter cucumber");
  }

  @When("^Do search$")
  public void when() throws Throwable {
	  System.out.println("Search");
  }

  @Then("^Results are shown for 'Cucumber'$")
  public void then() throws Throwable {
	  System.out.println("Verify results");
  }

}
