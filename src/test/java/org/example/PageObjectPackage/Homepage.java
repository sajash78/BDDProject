package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class        Homepage extends DriverFactory {
    @FindBy(id = "searchTerm")
    WebElement searchbox;

    @FindBy(xpath = "//body//header//div//div//div//div//span[2]")
    WebElement searchbutton;
    @FindBy(xpath = "//body//header//div//div//div//a[2]//*[local-name()='svg']")
    WebElement accountButton;
@FindBy(className = "search-title")
WebElement searchtiltelAssertion;
public void titleAssertion(){
    String actualtitle = searchtiltelAssertion.getText();
    Assert.assertThat(actualtitle,Matchers.containsString("nike"));
}

    //FindBy
    //WebElemnt nike
    public void doSearch(String item){
        searchbox.sendKeys(item);
        searchbutton.click();
    }
 public void homePageUrl(){
       String actual= driver.getCurrentUrl();
     Assert.assertThat(actual, Matchers.containsString("argos"));
 }
 public void clickOnAccountButton(){
        accountButton.click();

 }

}// class end
// pull practise
//wrong code
// reverting changing demo