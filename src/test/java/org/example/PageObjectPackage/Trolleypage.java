package org.example.PageObjectPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Trolleypage extends DriverFactory {
@FindBy (xpath = "//body/div/div/div/div/div/div/div/section/section/div/div/div/button/span/span[1]")
    WebElement addTrolley;

public void trolleyMethod(){
    addTrolley.click();
}



}
