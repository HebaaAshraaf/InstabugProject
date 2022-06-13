package pages;

import base.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class FacebookRegisterPage extends page {

    //Buttons Locators from the prop file
    private final String firstname = "facebook.register.firstname.xpath";
    private final String lastname = "facebook.register.lastname.xpath";
    private final String email_address = "facebook.register.email_address.xpath";
    private final String reemail_address = "facebook.register.reemail_address.xpath";
    private final String password = "facebook.register.password.id";
    private final String date_day = "facebook.register.Day.id";
    private final String date_month = "facebook.register.Month.id";
    private final String date_year = "facebook.register.Year.id";
    private final String genderF= "facebook.register.female.xpath";
    private final String genderM= "facebook.register.male.xpath";
    private final String signUpBTN= "facebook..register.signupBTN.xpath";

    public FacebookRegisterPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public void writeFirstName(String fname){
        elements.waits.waitElementTillVisibilityByXpath(firstname,driver,prop);
        elements.locators.getElementByXpath(firstname,driver,prop).sendKeys(fname);
    }

    public void writeLastName(String lname){
        elements.locators.getElementByXpath(lastname,driver,prop).sendKeys(lname);
    }

    public void writeemail_address(String emailaddress){
        elements.locators.getElementByXpath(email_address,driver,prop).sendKeys(emailaddress);
    }
    public void rewriteemail_address(String emailaddress){
        elements.locators.getElementByXpath(reemail_address,driver,prop).sendKeys(emailaddress);
    }

    public void writepassword(String pword){
        elements.locators.getElementByID(password,driver,prop).sendKeys(pword);
    }

    public void selectADayDate(String day){
        Select drpCountry = new Select(elements.locators.getElementByID(date_day,driver,prop));
        drpCountry.selectByVisibleText(day);
    }

    public void selectAMonthDate(String month){
        Select drpCountry = new Select(elements.locators.getElementByID(date_month,driver,prop));
        drpCountry.selectByVisibleText(month);
    }

    public void selectAYearDate(String year){
        Select drpCountry = new Select(elements.locators.getElementByID(date_year,driver,prop));
        drpCountry.selectByVisibleText(year);
    }

    public void selectGenderFemale(){
        elements.locators.getElementByXpath(genderF,driver,prop).click();
    }

    public void selectGenderMale(){
        elements.locators.getElementByXpath(genderM,driver,prop).click();
    }

    public FacebookConfPage clickOnregisterBTN() throws IOException {
        elements.locators.getElementByXpath(signUpBTN,driver,prop).click();
        return new FacebookConfPage(driver);
    }
}
