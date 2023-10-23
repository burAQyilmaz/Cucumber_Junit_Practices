package burak.step_definitions;

import burak.pages.automationexercise.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.BrowserUtility;
import utility.ConfigurationReader;
import utility.Driver;

public class TC1_RegisterUser_SD {

    MainPage mainPage=new MainPage();
    LoginPage loginPage=new LoginPage();
    SignupPage signupPage=new SignupPage();
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();
    DeletedAccountPage deletedAccountPage=new DeletedAccountPage();

    @Given("user is on the main page {string}")
    public void user_is_on_the_main_page(String expectedUrl) {
        String url = ConfigurationReader.getProperties(expectedUrl);
        Driver.getDriver().get(url);
    }

    @Then("page is loaded")
    public void page_is_loaded() {
        BrowserUtility.verifyIsPageLoaded();
    }

    @When("user clicks singuplogin button")
    public void user_clicks_singuplogin_button() {
        mainPage.signUpLoginLink.click();
    }

    @Then("{string} is visible")
    public void is_visible(String string) {
        switch (string){
            case "New User Signup!":
                Assert.assertTrue(loginPage.signupHeader.isDisplayed());
                break;
            case "ENTER ACCOUNT INFORMATION":
                Assert.assertTrue(signupPage.headerEnterAccountInfo.isDisplayed());
                break;
            case "ACCOUNT CREATED!":
                Assert.assertTrue(accountCreatedPage.headerAccountCreated.isDisplayed());
                break;
            case "Logged in as username":
                Assert.assertEquals("Logged in as " + ConfigurationReader.getProperties("userName"), mainPage.linkLoginAsUsername.getText());
                break;
            case "ACCOUNT DELETED!":
                Assert.assertTrue(deletedAccountPage.headerAccountDeleted.isDisplayed());
                break;
            default:
                System.out.println("You should switch case for this expected result");
        }
    }

    @When("user enters name and email address")
    public void user_enters_name_and_email_address() {
        loginPage.signupName.sendKeys(ConfigurationReader.getProperties("userName"));
        loginPage.signupEmail.sendKeys(ConfigurationReader.getProperties("email"));
    }

    @When("user clicks signup button")
    public void user_clicks_signup_button() {
        loginPage.signupBtn.click();
    }

    @When("user fills the signup forms")
    public void user_fills_the_signup_forms() {
        signupPage.fillTheForm();
    }

    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
        signupPage.createAccountBtn.click();
    }

    @When("user clicks continue button")
    public void user_clicks_continue_button() {
        accountCreatedPage.continueBtn.click();
    }

    @When("user clicks delete account button")
    public void user_clicks_delete_account_button() {
        mainPage.deleteAccountBtn.click();
    }

    @When("user clicks Continue button after account deleted")
    public void user_clicks_continue_button_after_account_deleted() {
        deletedAccountPage.continueBtn.click();
    }
}
