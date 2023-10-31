@smoke
Feature: Login And Logout functionality

  Scenario: Verify user should aable to login  with valid credential and logout Successfully
    Given I am on the login page
    When I enter valid username and Passwrd
    And I click on the Login button
    Then I should be landed to the admin dashboard page
    And I click on lout Drop down menu
    And I click on the Logout
    Then I should be laned to the Login page
    Then I close the browser
