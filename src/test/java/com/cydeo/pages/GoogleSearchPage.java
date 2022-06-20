package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){

        //Create constructor
        // initialize the driver instance and this class' instance using PageFactory.initElements() method
        PageFactory.initElements(Driver.getDriver(), this);

    }
    //We can start locating web elements by using @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;

    public String getCapital(){
        return Driver.getDriver().findElement(By.xpath("//a[@class='FLP8od']")).getText();
    }
}
