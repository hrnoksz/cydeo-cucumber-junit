package com.cydeo.step_definitions;

import com.cydeo.pages.CloudTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloudTables_StepDefinitions {

    CloudTablePage cloudTablePage = new CloudTablePage();
    String firstname;
    String lastname;

    @Given("user is on cloudTable home page")
    public void user_is_on_cloud_table_home_page() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @When("user clicks on new button")
    public void user_clicks_on_new_button() {
        cloudTablePage.newBtn.click();
    }

    @When("user enters {string} to firstname field")
    public void user_enters_to_firstname_field(String firstname) {
        cloudTablePage.firstname.sendKeys(firstname);
        this.firstname=firstname;
    }

    @When("user enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lastname) {
        cloudTablePage.lastname.sendKeys(lastname);
        this.lastname=lastname;
    }

    @When("user enters {string} to position field")
    public void user_enters_to_position_field(String position) {
        cloudTablePage.position.sendKeys(position);
    }

    @When("user enters {string} to salary field")
    public void user_enters_to_salary_field(String salary) {
        cloudTablePage.salary.sendKeys(salary);

    }

    @When("user clicks on create button")
    public void user_clicks_on_create_button() {
        cloudTablePage.createButton.click();
    }

    @Then("user should be able to find person at the search box {string}")
    public void user_should_be_able_to_find_person_at_the_search_box(String situation) {
        cloudTablePage.searchBox.clear();
        cloudTablePage.searchBox.sendKeys(this.firstname+" "+this.lastname);
        if(situation.equals("positive")){
            Assert.assertTrue(cloudTablePage.getNewPerson(firstname,lastname).isDisplayed());}
        else if(situation.equals("negative")){
            Assert.assertTrue(cloudTablePage.errorMessage.isDisplayed());}

    }
    @Then("user deletes the person created")
    public void user_deletes_the_person_created() {
            BrowserUtils.sleep(2);
            cloudTablePage.getNewPerson(firstname,lastname).click();
            cloudTablePage.deleteBtn.click();
            cloudTablePage.confirmDeleteBtn.click();
            BrowserUtils.sleep(2);
        }
    }



