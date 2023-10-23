package burak.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class AccountCreatedPage extends Base {

    public AccountCreatedPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(tagName = "h2")
    public WebElement headerAccountCreated;

    @FindBy(linkText = "Continue")
    public WebElement continueBtn;


}
