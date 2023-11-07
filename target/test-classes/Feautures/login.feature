@smoke
Feature: Login And Logout functionality

  Scenario: Verify user should able to login  with valid credential and logout Successfully
    Given I am on the login page
    When I enter valid username and Password
    And I click on the Login button
    Then I should be landed to the admin dashboard page
    And I click on lout Drop down menu
    And I click on the Logout
    Then I should be land to the Login page
    Then I close the browser
  Scenario: Verify user should not able to login  with invalid credential
    Given I am on the login page
    When I enter invalid credential
    And I click on the Login button
    Then I should see following message Invalid credentials

