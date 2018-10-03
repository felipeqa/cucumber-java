package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class LoginTwo {
    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();

        System.out.println("Value is: " + data.get(0).get(0));
        System.out.println("Value is: " + data.get(0).get(1));
    }
}
