Feature: Login Feature TWO
  This feature deals with the login functionality of the application

  Scenario: Login with correct user and password
    Given I navigate to the login page
    And I enter the following for login
      |Username|Password|
      |admin   |adminpassword|
    And I click login button
    Then I should see the userform page

