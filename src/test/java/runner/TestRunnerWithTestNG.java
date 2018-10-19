package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@CucumberOptions(features = {"src/test/java/features"}, glue = "steps", tags = "@w")
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {
}
