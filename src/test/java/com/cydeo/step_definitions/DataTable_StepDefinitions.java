package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_ı_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        /*
        //In order to handle dropdown, we have to create an object from Select class
        //And then we should pass dropdown locator in the constructor of Select class
        //Select select1 = new Select(Driver.getDriver().findElement(By.id("month")));

        //But in this case, we locate dropdown as a name of monthDropdown within DropdownsPage class
        //Therefore, we passed dropdownsPage.monthDropdown in the constructor of Select class

        Select select = new Select(dropdownsPage.monthDropdown);
        List<WebElement> monthsList = select.getOptions(); //it returns list of web elements

        //create a list of string and pass all the actual web element options string into that new list
        List<String> actualMonths = new ArrayList<>();

        for (WebElement each : monthsList) { //We iterate monthsList to reach each element
            actualMonths.add(each.getText()); // We added each element to actualMonths
        }

         */
        //This method will return us the list of String of given dropdowns' options
        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonths, actualMonths);
        //Assert will check the size of the lists first. If it is matching, it will check content one by one

    }
}
