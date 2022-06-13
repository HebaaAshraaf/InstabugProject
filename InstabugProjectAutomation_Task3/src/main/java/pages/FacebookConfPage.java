package pages;

import base.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class FacebookConfPage extends page {

    //Buttons Locators from the prop file
    private final String confHeader = "facebook.conf.header.xpath";

    public FacebookConfPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public String getTheHeaderMessage(){
        elements.waits.waitElementTillVisibilityByXpath(confHeader,driver,prop);
        return elements.locators.getElementByXpath(confHeader,driver,prop).getText();
    }
}
