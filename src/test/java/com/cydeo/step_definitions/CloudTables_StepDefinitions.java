package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CloudTables_StepDefinitions {

    @Given("user is on cloudTable home page")
    public void user_is_on_cloud_table_home_page() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }
    @When("user clicks on new button")
    public void user_clicks_on_new_button() {

    }
    @When("user enters {string} to firstname field")
    public void user_enters_to_firstname_field(String string) {

    }
    @When("user enters {string} to lastname field")
    public void user_enters_to_lastname_field(String string) {

    }
    @When("user enters {string} to position field")
    public void user_enters_to_position_field(String string) {

    }
    @When("user enters {string} to salary field")
    public void user_enters_to_salary_field(String string) {

    }
    @Then("user should be able to find person at the search box")
    public void user_should_be_able_to_find_person_at_the_search_box() {

    }

}
