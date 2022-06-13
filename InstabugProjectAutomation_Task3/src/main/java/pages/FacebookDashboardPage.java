package pages;

import base.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class FacebookDashboardPage extends page {

    //Buttons Locators from the prop file
    private final String accountName = "facebook.Dashboard.account.name.xpath";

    public FacebookDashboardPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public String getAccountName() {
        elements.waits.waitElementTillVisibilityByXpath(accountName,driver,prop);
        return elements.locators.getElementByXpath(accountName,driver,prop).getText();
    }
}
