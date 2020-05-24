package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Trolleypage;

public class TrolleypageSteps {
    Trolleypage trolleypage = new Trolleypage();



    @Given("^user in on the armband page$")
    public void user_in_on_the_armband_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user clicks on add to trolley$")
    public void user_clicks_on_add_to_trolley() throws Throwable {
        trolleypage.trolleyMethod();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should able to see pop up window to add to trolley$")
    public void user_should_able_to_see_pop_up_window_to_add_to_trolley() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
