package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){
        System.out.println("Opening Browser: Firefox");

        // Passing a dummy Webdriver instance
        base.driver = new FirefoxDriver();

    }

    @After
    public void tearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            // Take screenshot
            byte[] scrFile = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(scrFile, "image/png");
            System.out.println(scenario.getName());
        }

        System.out.println("Closing Browser: MOCK");
        System.out.println(scenario.getName());
        base.driver.close();
    }
}
