package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CloudTablePage {

    public CloudTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
