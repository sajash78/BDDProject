Feature: Filter product Section

Background:
Given user is on the homepage of argos website
  When user wants to search for product
  Then user should see all the relavent searched products.

  Given  user is on the result page of the argos website
  When  user click on the Running filter
  Then user should see all the products assostiated with runnning filter

  Scenario: Click on one of the products
    Given user is on the result page of filter
    When user click on armband
    Then user should able to see that product to add in basket page