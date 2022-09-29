package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverview extends BasePage{

    private By finishBtn = By.xpath("//*[@id=\"finish\"]");

    public CheckoutOverview (WebDriver driver) {
        super(driver);
    }
    public WebElement getFinishBtn(){
        return getDriver().findElement(finishBtn);
    }

    public void finishing(){
        getFinishBtn().click();
    }


}
