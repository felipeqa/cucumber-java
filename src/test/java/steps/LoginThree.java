package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class LoginThree extends BaseUtil {

    private BaseUtil base;
    public LoginThree(BaseUtil base) {
        this.base = base;
    }

    @And("^I enter the following for login another approach$")
    public void iEnterTheFollowingForLoginAnotherApproach(DataTable table) throws Throwable {

        // Create an arraylist
        List<User> users = new ArrayList<User>();

        // Store all users
        users = table.asList(User.class);

//        for(User user : users){
//            System.out.println("The username is " + user.username);
//            System.out.println("The password is " + user.password);
//        }

        LoginPage page = new LoginPage(base.driver);

        for(User user : users){
            page.Login(user.username, user.password);
        }

    }

    public class User{
        String username;
        String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
