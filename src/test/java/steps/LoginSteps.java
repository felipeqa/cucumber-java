package steps;


import Base.BaseUtil;
import Transformation.EmailTranform;
import Transformation.SalaryCountTransform;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
       base.driver.get("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        base.driver.findElement(By.name("Login")).submit();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        new WebDriverWait(base.driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("Initial")));

        Assert.assertEquals("Its not displayed", base.driver.findElement(By.id("Initial")).isDisplayed(), true);

        // simple exemple of assert
        assertTrue(true);
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
