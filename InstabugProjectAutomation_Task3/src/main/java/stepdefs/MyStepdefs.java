package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.io.IOException;

public class MyStepdefs {

    protected WebDriver driver;

    //Pages
    private FacebookLoginPage facebookLoginPage;
    private FacebookDashboardPage facebookDashboardPage;
    private FacebookRegisterPage facebookRegisterPage;
    private FacebookConfPage facebookConfPage;

    @Before
    public void setup() throws Exception {
        //set path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        //create chrome instance
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public MyStepdefs() {}

    @Given("The user opens Facebook Login page")
    public void the_user_opens_Facebook_login_page() throws IOException {
        facebookLoginPage = new FacebookLoginPage(driver);
    }

    @And("the user write login email address {string}")
    public void theUserWriteLoginEmailAddress(String arg0){facebookLoginPage.writeEmail(arg0);}

    @And("the user write login password {string}")
    public void theUserWriteLoginPassword(String arg0) {facebookLoginPage.writePass(arg0);}

    @When("the user click loginBTN")
    public void theUserClickLoginBTN() throws IOException {
        facebookDashboardPage = facebookLoginPage.clickOnLoginBTN();
    }

    @Then("the dashboard appears with {string}")
    public void theDashboardAppears(String arg0) {
        Assert.assertEquals(facebookDashboardPage.getAccountName(),arg0);
    }

    @Then("the error message appears with {string}")
    public void theErrorMessageAppearsWith(String arg0) {
        Assert.assertEquals(facebookLoginPage.getErrorMSG(),arg0);
    }

    @And("The user click on Create new Account")
    public void theUserClickOnCreateNewAccount() throws IOException {
        facebookRegisterPage = facebookLoginPage.clickOnRegisterBTN();
    }

    @When("the user write First name {string}")
    public void theUserWriteFirstName(String arg0){
        facebookRegisterPage.writeFirstName(arg0);
    }

    @And("the user write Last name {string}")
    public void theUserWriteLastName(String arg0) {
        facebookRegisterPage.writeLastName(arg0);
    }

    @And("the user write email address {string}")
    public void theUserWriteEmailAddress(String arg0) {
        facebookRegisterPage.writeemail_address(arg0);
    }

    @And("the user rewrite the email address {string}")
    public void theUserRewriteTheEmailAddress(String arg0) {
        facebookRegisterPage.rewriteemail_address(arg0);
    }

    @And("the user write password {string}")
    public void theUserWritePassword(String arg0) {
        facebookRegisterPage.writepassword(arg0);
    }

    @And("the user select day {string}")
    public void theUserSelectDay(String arg0) {
        facebookRegisterPage.selectADayDate(arg0);
    }

    @And("the user select month {string}")
    public void theUserSelectMonth(String arg0) {
        facebookRegisterPage.selectAMonthDate(arg0);
    }

    @And("the user select year {string}")
    public void theUserSelectYear(String arg0) {
        facebookRegisterPage.selectAYearDate(arg0);
    }

    @And("the user select gender female")
    public void theUserSelectGenderFemale() {
        facebookRegisterPage.selectGenderFemale();
    }

    @And("the user click signUpBTN")
    public void theUserClickSignUpBTN() throws IOException {
        facebookConfPage = facebookRegisterPage.clickOnregisterBTN();
    }

    @Then("the code page appears with {string}")
    public void theCodePageAppearsWith(String arg0) {
        Assert.assertEquals(facebookConfPage.getTheHeaderMessage(),arg0);
    }
}
