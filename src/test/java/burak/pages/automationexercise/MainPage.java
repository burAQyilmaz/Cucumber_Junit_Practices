package burak.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class MainPage extends Base {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Signup / Login")
    public WebElement signUpLoginLink;

    @FindBy(partialLinkText = "Logged")
    public WebElement linkLoginAsUsername;

    @FindBy(partialLinkText = "Delete")
    public WebElement deleteAccountBtn;

    @FindBy(partialLinkText = "Logout")
    public WebElement logoutBtn;

    @FindBy(partialLinkText = "Contact us")
    public WebElement contactUsBtn;

    @FindBy(partialLinkText = "Test Cases")
    public WebElement testCasesBtn;

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subcriptionHeader;

    @FindBy(xpath = "//div[.='You have been successfully subscribed!']")
    public WebElement succesfullySubscribed;
}
