package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private By usernameField = By.xpath("//*[@id=\"user-name\"]");
    private By passwordField = By.xpath("//*[@id=\"password\"]");
    private By loginBtn = By.xpath("//*[@id=\"login-button\"]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUsernameField(){
        return getDriver().findElement(usernameField);
    }

    public WebElement getPasswordField(){
        return  getDriver().findElement(passwordField);
    }

    public WebElement getLoginBtn(){
        return  getDriver().findElement(loginBtn);
    }

    public void login(String username, String password){
        getUsernameField().clear();
        getPasswordField().clear();
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginBtn().click();
}
}
