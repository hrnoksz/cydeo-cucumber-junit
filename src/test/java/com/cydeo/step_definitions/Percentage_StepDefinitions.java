package com.cydeo.step_definitions;

import com.cydeo.pages.PercentagePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import java.util.Map;

public class Percentage_StepDefinitions {

    PercentagePage percentagePage = new PercentagePage();

    @Given("User is on the percentage calculator page")
    public void user_is_on_the_percentage_calculator_page() {
        Driver.getDriver().get("https://percentagecalculator.net/");
    }
    @Then("user should see following calculation results")
    public void user_should_see_following_calculation_results(Map<Integer, Integer> valuesMap) {
        percentagePage.percent.sendKeys("5");

        for (Integer inputKey : valuesMap.keySet()) {
            percentagePage.input.clear();
            percentagePage.input.sendKeys(""+inputKey+ Keys.ENTER);
        }
    }
}
