package steps;


import Base.BaseUtil;
import Transformation.EmailTranform;
import Transformation.SalaryCountTransform;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println(base.stepInfo);
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {


    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {


    }

    @And("^I enter the user email address as Email:([^\"]*)$")
    public void iEnterTheUserEmailAddressAsEmailAdmin(@Transform(EmailTranform.class)String email) throws Throwable {
        System.out.println();
        System.out.println("This email is: " + email);
        System.out.println();
    }

    @And("^I verify the count of my salary digits for R$ (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForR$(int arg0) throws Throwable {

    }

    @And("^I verify the count of my salary digits for Rs (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForRs(@Transform(SalaryCountTransform.class)int salary) throws Throwable {
        System.out.println("My salary digits count is : " + salary);
        System.out.println();
    }
}
