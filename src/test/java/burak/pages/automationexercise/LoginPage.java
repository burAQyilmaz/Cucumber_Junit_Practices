package burak.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigurationReader;
import utility.Driver;

public class LoginPage extends Base {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[type='email']")
    public WebElement loginEmail;

    @FindBy(css = "input[name='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginBtn;

    @FindBy(css = ".login-form>h2")
    public WebElement loginHeader;


    @FindBy(css = "input[type='text']")
    public WebElement signupName;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement signupEmail;

    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupBtn;

    @FindBy(css = ".signup-form>h2")
    public WebElement signupHeader;

    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement emailAlreadyExist;

    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement emailOrPasswordIncorrect;


    String name = ConfigurationReader.getProperties("userName");
    String password = ConfigurationReader.getProperties("password");
    String email = ConfigurationReader.getProperties("email");

    public void login() {

        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        loginBtn.click();
    }

    public void login(String emailIncorrect,String passwordIncorrect) {

        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        loginBtn.click();
    }

    public void goToSignup() {

        signupName.sendKeys(name);
        signupEmail.sendKeys(email);
        signupBtn.click();
    }

    public void createUser() {

        Driver.getDriver().get("https://www.automationexercise.com/login");
        goToSignup();

        try {
            emailAlreadyExist.isDisplayed();


        } catch (RuntimeException e) {
            SignupPage signupPage = new SignupPage();
            signupPage.fillTheForm();
        }
        Driver.closeDriver();
    }

}
