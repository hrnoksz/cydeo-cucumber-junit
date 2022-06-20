package com.cydeo.step_definitions;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;

public class calculatorStepDefinitions {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("user is on calculator page")
    public void user_is_on_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }

    @When("user clicks {string} on calculator")
    public void user_clicks_on_calculator(String button) {
        calculatorPage.button(button).click();
    }
    @Then("result {string} should be displayed")
    public void result_should_be_displayed(String expectedResult) {
       String actualResult = calculatorPage.outPut.getText().trim();
       Assert.assertEquals("Wrong Calculation", expectedResult, actualResult);
    }







}
