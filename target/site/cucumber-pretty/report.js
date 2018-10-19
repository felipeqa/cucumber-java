$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginSix.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature FIVE",
  "description": "This feature deals with the login functionality of the application",
  "id": "login-feature-five",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2358520554,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct user and password",
  "description": "",
  "id": "login-feature-five;login-with-correct-user-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@w"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the user email address as Email:admin",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify the count of my salary digits for Rs 1000000000",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I just need to see how step looks for Cucumber-Java8",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 1863012125,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 40
    }
  ],
  "location": "LoginSteps.iEnterTheUserEmailAddressAsEmailAdmin(String)"
});
formatter.result({
  "duration": 1519863,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000000000",
      "offset": 46
    }
  ],
  "location": "LoginSteps.iVerifyTheCountOfMySalaryDigitsForRs(int)"
});
formatter.result({
  "duration": 385531,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 51
    }
  ],
  "location": "Java8VersionSteps.java:8"
});
formatter.result({
  "duration": 274972,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginButton()"
});
formatter.result({
  "duration": 40126811,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheUserformPage()"
});
formatter.result({
  "duration": 703161823,
  "status": "passed"
});
formatter.after({
  "duration": 110633,
  "status": "passed"
});
});