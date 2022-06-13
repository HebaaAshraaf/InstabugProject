package pages;

import base.page;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class FacebookLoginPage extends page {

    //The path of url data in properties file
    private final String URL = "facebook.login.url";

    //Buttons Locators from the prop file
    private final String emailID = "facebook.login.email.id";
    private final String passID ="facebook.login.pass.id";
    private final String loginBTN ="facebook.login.loginBTN.xpath";
    private final String registerBTN ="facebook.login.registerBTN.xpath";
    private final String errorMSG ="facebook.login.errorMSG.xpath";

    public FacebookLoginPage(WebDriver driver) throws IOException {
        super(driver);
        driver.get(readers.PropReader.read(URL, prop));
    }

    public void writeEmail(String arg) {
        elements.locators.getElementByID(emailID, driver, prop).sendKeys(arg);
    }

    public void writePass(String arg) {
        elements.locators.getElementByID(passID, driver, prop).sendKeys(arg);
    }

    public FacebookRegisterPage clickOnRegisterBTN() throws IOException{
        elements.locators.getElementByXpath(registerBTN, driver, prop).click();
        return new FacebookRegisterPage(driver);
    }

    public FacebookDashboardPage clickOnLoginBTN() throws IOException {
        elements.locators.getElementByXpath(loginBTN, driver, prop).click();
        return new FacebookDashboardPage(driver);
    }

    public String getErrorMSG() {
        return elements.locators.getElementByXpath(errorMSG, driver, prop).getText();
    }
}
