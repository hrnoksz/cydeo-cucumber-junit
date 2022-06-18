package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class calculatorStepDefinitions {

    @Given("user is on calculator page")
    public void user_is_on_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }
    @When("user clicks {string} on calculator")
    public void user_clicks_on_calculator(String string) {

    }

}
