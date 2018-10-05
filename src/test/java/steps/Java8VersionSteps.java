package steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class Java8VersionSteps implements En {
    public Java8VersionSteps() {
        And("^I just need to see how step looks for Cucumber-Java(\\d+)$", (Integer javaVersion) -> {
            System.out.println("The value from new step class is " + javaVersion);
        });
    }
}
