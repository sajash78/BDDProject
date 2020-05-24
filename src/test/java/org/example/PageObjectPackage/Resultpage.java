package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage extends DriverFactory {
    @FindBy(xpath = "//div//div//div//div//div//div//div//li[1]//a[1]//span[1]")
    WebElement runningButton;

    public void runningFilter(){

        runningButton.click();
    }
    @FindBy (className = "search-title")
    WebElement runninigTitle;

    public void runninigAssertion(){
        String actualrunning= runninigTitle.getText();
        Assert.assertThat(actualrunning, Matchers.containsString("Running"));
    }

}
