package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Netflix_StepDefinitions {

    @Given("I like {string}")
    public void ı_like(String string) {
        System.out.println("This is from Given String parameters");
    }

    @When("I go to homepage")
    public void ı_go_to_homepage() {

    }

    @Then("I should get right recommendation")
    public void ı_should_get_right_recommendation() {

    }

    @Given("I like")
    public void ı_like(List<String> movieTypes) {
        System.out.println("This is from Given List of StringDataTable " + movieTypes);
    }

}
