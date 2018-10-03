package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void initializeTest(){
        System.out.println("Opening Browser: MOCK");
    }

    @After
    public void tearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            // Take screenshot
            System.out.println(scenario.getName());
        }

        System.out.println("Closing Browser: MOCK");
        System.out.println(scenario.getName());
    }
}
