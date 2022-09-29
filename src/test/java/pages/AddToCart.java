package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class AddToCart extends BasePage {

    private By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By goToCartBtn = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    private By status = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    private By product1 = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]");


    public AddToCart(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddToCartBtn() {
        return getDriver().findElement(addToCartBtn);
    }

    public WebElement getGoToCart() {
        return getDriver().findElement(goToCartBtn);
    }

    public WebElement getStatus() {
        return getDriver().findElement(status);
    }
    public WebElement getProduct1(){
        return getDriver().findElement(product1);
    }

    public void addingToCart() throws InterruptedException {

        getAddToCartBtn().click();
        getGoToCart().click();

    }

    public void goToCart(){
        getGoToCart().click();
    }

}
