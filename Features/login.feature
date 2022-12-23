Feature: All login tests

  Scenario: to test the functionality of login button for valid inputs
    Given I am on login page
    When I enter correct username and correct password
    And click on login button
    Then I should land on Home page