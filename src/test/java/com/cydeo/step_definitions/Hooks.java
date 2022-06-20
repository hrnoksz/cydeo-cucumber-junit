package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    /*
    In the class we will be able to pas pre- & post-conditions to
    each scenario and each step
    */

    //import from io.cucumber.java not from junit
    //@Before (order = 1)
    public void setupScenario(){
        System.out.println("===Setting up browser using cucumber @Before===");
    }
    /*
    we can create more than one @Before, @After, @BeforeStep, @AfterStep
    If we have multiple versions of the same annotation,
    we can prioritize the running order using the "order" keyword.
    @Before (order = 1)

    We can also specify which annotation is running for which scenarios or features using @TAGS.
    If I want some scenario/feature to have pre- /post- conditions, I can use certain @TAG,
    and pass the same @TAG into the annotation in Hooks class.
    @Before ("@login") or
    @Before (value = "@login", order = 2)
    @Before (value = "@db", order = 0)
     */

    //@Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.println("===This will only apply to scenarios with @login tag===");
    }

    //@Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("===This will only apply to scenarios with @db tag===");
    }

    //import from io.cucumber.java not from junit
    @After
    public void teardownScenario(Scenario scenario){

        // scenario.isFailed() --> if scenario fails, this method will return TRUE boolean value
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(5);
        Driver.closeDriver();
        //System.out.println("===Closing browser using cucumber @After===");
        //System.out.println("===Scenario ended/ Take screenshot if failed!");
    }

    //@BeforeStep
    public void  setupStep(){
        System.out.println("----applying setup using @BeforeStep----");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("----applying tearDown using @AfterStep----");
    }
}
