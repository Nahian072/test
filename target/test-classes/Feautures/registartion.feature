Feature: Verify registration functionality
  Scenario:New customer registration
    Given I am on the registration page
    When I enter a valid Username "JohnDoe123"
    And I enter a valid Email address "john.doe@example.com"
    And I enter a valid Password "P@ssword"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page