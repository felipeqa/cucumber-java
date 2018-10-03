Feature: Login Feature FOUR
  This feature deals with the login functionality of the application

  Scenario Outline: Login with correct user and password using scenario outline
    Given I navigate to the login page
    And I enter the <username> and <password>
    And I click login button
    Then I should see the userform page

    Examples:
      |username|password|
      |admin   |adminpassword|
      |admin   |admin        |
