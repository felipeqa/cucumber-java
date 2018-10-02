Feature: Login Feature
  This feature deals with the login functionality of the application

  Scenario: Login with correct user and password
    Given I navigate to the login page
    And I enter the username as "admin" and password as "adminpassword"
    And I click login button
    Then I should see the userform page
