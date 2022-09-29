package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCart extends BasePage {

    private By checkOutBtn = By.xpath("//*[@id=\"checkout\"]");

    public YourCart (WebDriver driver) {
        super(driver);
    }

    public WebElement getCheckOutBtn(){
        return getDriver().findElement(checkOutBtn);
    }

    public void checkingOut(){
        getCheckOutBtn().click();
    }

}
