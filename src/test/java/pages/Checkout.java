package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout extends BasePage {

    private By firstNameField = By.xpath("//*[@id=\"first-name\"]");
    private By lastNameField = By.xpath("//*[@id=\"last-name\"]");
    private By postalCode = By.xpath("//*[@id=\"postal-code\"]");
    private By continueBtn = By.xpath("//*[@id=\"continue\"]");


    public Checkout(WebDriver driver) {
        super(driver);
    }


    public WebElement getFirstNameField(){
        return getDriver().findElement(firstNameField);
    }
    public WebElement getLastNameField(){
        return getDriver().findElement(lastNameField);
    }
    public WebElement getPostalCode(){
        return getDriver().findElement(postalCode);
    }
    public WebElement getContinueBtn(){
        return getDriver().findElement(continueBtn);
    }


    public void insertData(){

        getFirstNameField().sendKeys("Aleksandra");
        getLastNameField().sendKeys("Zujovic");
        getPostalCode().sendKeys("21000");
        getContinueBtn().click();


    }



}
