package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@CucumberOptions(features = {"src/test/java/features"},
        glue = "steps", tags = "@w", format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"})
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {
}
