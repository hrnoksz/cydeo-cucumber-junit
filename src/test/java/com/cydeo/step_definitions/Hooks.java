package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    /*
    In the class we will be able to pas pre- & post-conditions to
    each scenario and each step
    */

    //import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("===Setting up browser using cucumber @Before===");
    }

    //import from io.cucumber.java not from junit
    @After
    public void teardownScenario(){
        System.out.println("===Closing browser using cucumber @After===");
        System.out.println("===Scenario ended/ Take screenshot if afiled!");
    }

    @BeforeStep
    public void  setupStep(){
        System.out.println("----applying setup using @BeforeStep----");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("----applying tearDown using @AfterStep----");
    }
}
