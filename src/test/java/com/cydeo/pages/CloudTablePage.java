package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablePage {

    public CloudTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button/span[.='New']")
    public WebElement newBtn;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstname;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastname;

    @FindBy(id = "DTE_Field_position")
    public WebElement position;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button/span[.='Delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement confirmDeleteBtn;

    @FindBy(xpath = "//td[.='No matching records found']")
    public WebElement errorMessage;


    public WebElement getNewPerson(String firstname, String lastname){
        return Driver.getDriver().findElement(By.xpath("//td[.='"+firstname+" "+lastname+"']"));
    }
}
