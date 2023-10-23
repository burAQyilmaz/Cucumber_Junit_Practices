package burak.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class DeletedAccountPage extends Base {

    public DeletedAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(tagName = "h2")
    public WebElement headerAccountDeleted;

    @FindBy(linkText = "Continue")
    public WebElement continueBtn;
}
