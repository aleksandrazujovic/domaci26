package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete extends BasePage{
    private By message = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

    public CheckoutComplete (WebDriver driver) {
        super(driver);
    }
    public WebElement getMessage(){
        return getDriver().findElement(message);
    }



}
