@w
Feature: Login Feature SIX
  This feature deals with the login functionality of the application

  Scenario: Login with correct user and password
    Given I navigate to the login page
    And I enter the user email address as Email:admin
    And I verify the count of my salary digits for Rs 1000000000
    And I just need to see how step looks for Cucumber-Java8
    And I click login button
    Then I should see the userform page

  Scenario: Login with correct user and password to fail
    Given I navigate to the login page
    When I enter the user email address as Email:admin
    Then I should see the userform page