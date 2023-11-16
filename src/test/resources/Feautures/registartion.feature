Feature: Verify registration functionality
  Scenario:New customer registration
    Given I am on the registration page
    When I enter a valid Username "aohn12D55oe123"
    And I enter a valid Email address "aohn22.doe@example.com"
    And I enter a valid Password "aohn22.doe@example.com"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page

  Scenario:User Register with a weak password
    Given I am on the registration page
    When I enter a valid Username "John12D55oe123"
    And I enter a valid Email address "john22.doe@example.com"
    And I enter a weak Password "john223"
    Then I should see an error message for weak password

  Scenario:User Register with an existing usernmame
    Given I am on the registration page
    When I enter a esisting Username "John12D55oe123"
    And I enter a valid Email address "john5522.doe@example.com"
    And I enter a valid Password "john2255.doe@example.com"
    And I submit the registration form
    Then I should see an error message for esisting username