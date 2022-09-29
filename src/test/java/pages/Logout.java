package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout extends BasePage {

    private By hamburgerBtn = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
    private By logOut = By.xpath("//*[@id=\"logout_sidebar_link\"]");

    private By loginBtn = By.xpath("//*[@id=\"login-button\"]");


    public Logout(WebDriver driver) {
        super(driver);
    }

    public WebElement getHamburgerBtn(){
        return getDriver().findElement(hamburgerBtn);
    }

    public WebElement getLogout(){
        return getDriver().findElement(logOut);
    }

    public WebElement getLoginBtn(){
        return  getDriver().findElement(loginBtn);
    }

    public void loggingOut() throws InterruptedException {
        Thread.sleep(3000);
        getHamburgerBtn().click();
        Thread.sleep(3000);
        getLogout().click();
    }
}
