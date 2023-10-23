package burak.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public abstract class Base {

    public Base(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Home")
    public WebElement homeLink;

    @FindBy(partialLinkText = "Products")
    public WebElement productsLink;

    @FindBy(partialLinkText = "Cart")
    public WebElement cartLink;

    @FindBy(partialLinkText = "Signup / Login")
    public WebElement signUpLoginLink;

    @FindBy(partialLinkText = "Logged")
    public WebElement linkLoginAsUsername;

    @FindBy(partialLinkText = "Delete")
    public WebElement DeleteAccountBtn;

    @FindBy(partialLinkText = "Logout")
    public WebElement logoutBtn;

    @FindBy(partialLinkText = "Contact us")
    public WebElement contactUsBtn;

    @FindBy(partialLinkText = "Test Cases")
    public WebElement testCasesBtn;

    @FindBy(partialLinkText = "API Testing")
    public WebElement APITestingLink;

    @FindBy(partialLinkText = "Video Tutorials")
    public WebElement videoTutorialsLink;

    @FindBy(id = "susbscribe_email")
    public WebElement susbscribe_emailInput;

    @FindBy(id = "subscribe")
    public WebElement subscribeBtn;
}
