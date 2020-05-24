package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Filterpage;

public class FilterpageSteps {
    Filterpage filterpage = new Filterpage();


    @Given("^user is on the result page of filter$")
    public void user_is_on_the_result_page_of_filter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user click on armband$")
    public void user_click_on_armband() throws Throwable {
        Thread.sleep(4000);
        filterpage.armbandMethod();
    }

    @Then("^user should able to see that product to add in basket page$")
    public void user_should_able_to_see_that_product_to_add_in_basket_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
