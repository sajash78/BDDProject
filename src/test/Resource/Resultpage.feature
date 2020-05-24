Feature: Resultpage functionality

  Background:
    Given user is on the homepage of argos website
    When user wants to search for product
    Then user should see all the relavent searched products.

  Scenario: Click on Running filter
    Given  user is on the result page of the argos website
    When  user click on the Running filter
    Then user should see all the products assostiated with runnning filter