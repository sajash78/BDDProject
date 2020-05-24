package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class Filterpage extends DriverFactory {
    @FindBy (xpath = "//body/div/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/a[1]")
    WebElement armband;

    public void armbandMethod(){
        armband.click();
    }




}
