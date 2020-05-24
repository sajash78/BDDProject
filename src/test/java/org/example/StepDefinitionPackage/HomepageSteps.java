package org.example.StepDefinitionPackage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;

public class HomepageSteps {
   Homepage homepage = new Homepage();
    @Given("^user is on the homepage of argos webste$")
    public void user_is_on_the_homepage_of_argos_webste() throws Throwable {
     homepage.homePageUrl();
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user wants to search for product$")
    public void user_wants_to_search_for_product() throws Throwable {
        homepage.doSearch("nike>adidas");
        // Write code here tha/t turns the phrase above into concrete actions
    }

    @Then("^user should see all the relavent searched products\\.$")
    public void user_should_see_all_the_relavent_searched_products() throws Throwable {
     homepage.titleAssertion(); // assertion of nike
    }

 @When("^user click on the account$")
 public void userClickOnTheAccount() {
     homepage.clickOnAccountButton();
 }

 @Then("^user should able to see all the detail of account$")
 public void userShouldAbleToSeeAllTheDetailOfAccount() {
 }

 @Given("^user is on the homepage of argos website$")
 public void userIsOnTheHomepageOfArgosWebsite() {
 }

 @Given("^Given user is on the homepage of argos website$")
 public void givenUserIsOnTheHomepageOfArgosWebsite() {
 }

 @When("^user try to find multiple \"([^\"]*)\"$")
 public void userTryToFindMultiple(String item) throws Throwable {
  // Write code here that turns the phrase above into concrete actions
  homepage.doSearch(item);

 }
}
