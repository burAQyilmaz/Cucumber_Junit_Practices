package burak.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class ProductsPage {

    public ProductsPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[@id='cartModal']/following-sibling::div")
    public List<WebElement>productList;

    @FindBy(xpath = "(//a[.='View Product'])")
    public List<WebElement> productViewBtn;

    @FindBy(xpath = "(//div[@class='product-information']//h2)")
    public WebElement productName;

    @FindBy(xpath = "(//div[@class='product-information']//p)[1]")
    public WebElement productCategory;

    @FindBy(xpath = "(//div[@class='product-information']//span)[2]")
    public WebElement productPrice;

    @FindBy(xpath = "(//div[@class='product-information']//p)[2]")
    public WebElement productAvailability;

    @FindBy(xpath = "(//div[@class='product-information']//p)[3]")
    public WebElement productCondition;

    @FindBy(xpath = "(//div[@class='product-information']//p)[4]")
    public WebElement productBrand;

    @FindBy(id = "search_product")
    public WebElement searchBox;

    @FindBy(id = "submit_search")
    public WebElement searchBtn;

    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProductsHeader;

    @FindBy(className = "add-to-cart")
    public List<WebElement> addToCartBtn;

    @FindBy(xpath = "(//button[.='Continue Shopping'])")
    public List<WebElement> continueShoppingBtn;

    @FindBy(partialLinkText = "View Cart")
    public WebElement viewCartLink;

}
