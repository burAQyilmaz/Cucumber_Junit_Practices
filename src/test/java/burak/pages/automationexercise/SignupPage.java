package burak.pages.automationexercise;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.ConfigurationReader;
import utility.Driver;

public class SignupPage extends Base {

    public SignupPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".title.text-center>b")
    public WebElement headerEnterAccountInfo;

    @FindBy(id = "id_gender1")
    public WebElement titleGender1;

    @FindBy(id = "id_gender2")
    public WebElement titleGender2;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;;

    @FindBy(id = "days")
    public WebElement day;

    @FindBy(id = "months")
    public WebElement month;

    @FindBy(id = "years")
    public WebElement year;

    @FindBy(id = "newsletter")
    public WebElement checkboxNewsletter;

    @FindBy(id = "optin")
    public WebElement checkboxPartners;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipcode;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumber;

    @FindBy(className = "btn-default")
    public WebElement createAccountBtn;


    public void fillTheForm() {

        Faker faker = new Faker();

        titleGender1.click();
        password.sendKeys(ConfigurationReader.getProperties("password"));

        Select select = new Select(day);
        select.selectByIndex(3);

        select = new Select(month);
        select.selectByIndex(5);

        select = new Select(year);
        select.selectByIndex(34);

        //Select checkbox 'Sign up for our newsletter!'
        checkboxNewsletter.click();

        //Select checkbox 'Receive special offers from our partners!'
        checkboxPartners.click();

        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        country.sendKeys(faker.company().name());
        address1.sendKeys(faker.address().fullAddress());
        address2.sendKeys(faker.address().secondaryAddress());

        select = new Select(country);
        select.selectByVisibleText("Canada");

        state.sendKeys(faker.address().state());
        city.sendKeys(faker.address().city());
        zipcode.sendKeys(faker.address().zipCode());
        mobileNumber.sendKeys(faker.phoneNumber().cellPhone());
    }
}
