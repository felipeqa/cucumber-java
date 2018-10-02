package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {


    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {


    }

}
