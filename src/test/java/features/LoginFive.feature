Feature: Login Feature FIVE
  This feature deals with the login functionality of the application

  Scenario: Login with correct user and password
    Given I navigate to the login page
    And I enter the user email address as Email:admin
    And I verify the count of my salary digits for Rs 1000000000
    And I click login button
    Then I should see the userform page
