package burak.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class ContactUsPage extends Base {

    public ContactUsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='Get In Touch']")
    public WebElement getInTouchHeader;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(name = "email")
    public WebElement inputEmail;

    @FindBy(name = "subject")
    public WebElement inputSubject;

    @FindBy(id = "message")
    public WebElement inputMessage;

    @FindBy(name = "upload_file")
    public WebElement uploadFile;

    @FindBy(name = "submit")
    public WebElement submitBtn;


    @FindBy(xpath = "//div[.='Success! Your details have been submitted successfully.']")
    public WebElement successMessage;

    @FindBy(partialLinkText = " Home")
    public WebElement homeLink;
}
