package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import java.util.ArrayList;
import java.util.List;

public class LoginThree {
    @And("^I enter the following for login another approach$")
    public void iEnterTheFollowingForLoginAnotherApproach(DataTable table) throws Throwable {

        // Create an arraylist
        List<User> users = new ArrayList<User>();

        // Store all users
        users = table.asList(User.class);

        for(User user : users){
            System.out.println("The username is " + user.username);
            System.out.println("The password is " + user.password);
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
