package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;
import org.example.PageObjectPackage.Resultpage;

public class ResultPageSteps {

    Resultpage resultpage = new Resultpage();
    Homepage homepage = new  Homepage();

    @Given("^user is on the result page of the argos website$")
    public void user_is_on_the_result_page_of_the_argos_website() throws Throwable {

    }

    @When("^user click on the Running filter$")
    public void user_click_on_the_Running_filter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        resultpage.runningFilter();

    }

    @Then("^user should see all the products assostiated with runnning filter$")
    public void user_should_see_all_the_products_assostiated_with_runnning_filter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
        resultpage.runninigAssertion();

    }


}
