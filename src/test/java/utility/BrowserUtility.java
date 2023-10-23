package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class BrowserUtility {

    public static void sleep(int second){

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void waitForVisibilityOf(WebElement webElement){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForInVisibilityOf(WebElement webElement){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void verifyTitle( String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    public static void verifyIsPageLoaded(){

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        boolean  result=js.executeScript("return document.readyState").equals("complete");
        Assert.assertTrue("Page is not completely loaded", result);

    }
    public static void alertAccept(){
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void alertDismiss(){
        Driver.getDriver().switchTo().alert().dismiss();
    }

    public static void alertGetText(){
        Driver.getDriver().switchTo().alert().getText();
    }

    public static void alertSendKeysAccept(String text){
        Driver.getDriver().switchTo().alert().sendKeys(text);
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void alertSendKeysDismiss(String text){
        Driver.getDriver().switchTo().alert().sendKeys(text);
        Driver.getDriver().switchTo().alert().dismiss();
    }

    public static void scrollByVertical(int pixel){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,"+pixel+")");
    }

    public static void scrollByHorizontal(int pixel){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy("+pixel+",0)");
    }

    public static void scrollByVerticalAutomatically(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        int pixel=25;

        while (true){
            try{
                element.click();
                return;
            }catch (RuntimeException e){
                js.executeScript("window.scrollBy(0,"+pixel+")");
            }
        }
    }
}
