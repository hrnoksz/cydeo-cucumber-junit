package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dice_StepDefinitions {

    @Given("user is on dice homepage")
    public void user_is_on_dice_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));
    }
    @When("user enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {

    }
    @Then("user should see search results")
    public void user_should_see_search_results() {

    }

}
