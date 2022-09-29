package test;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class Test {

    private LoginPage loginPage;
    private AddToCart addToCart;
    private WebDriver driver;

    private Checkout checkOut;
    private Logout logout;

    private CheckoutComplete checkoutComplete;

    private CheckoutOverview checkoutOverview;

    private YourCart yourCart;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\bootcamp\\msedgedriver.exe");
        driver = new EdgeDriver();
        loginPage = new LoginPage(driver);
        addToCart = new AddToCart(driver);
        checkOut = new Checkout(driver);
        logout = new Logout(driver);
        checkoutComplete = new CheckoutComplete(driver);
        checkoutOverview = new CheckoutOverview(driver);
        yourCart = new YourCart(driver);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://www.saucedemo.com");
    }


    @org.testng.annotations.Test (priority = 3)
    public void testLogin () {
            loginPage.login("standard_user", "secret_sauce");
            String expectedResult = "PRODUCTS";
            String actualResult = loginPage.getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
            Assert.assertEquals(actualResult,expectedResult);
        }

    @org.testng.annotations.Test (priority = 2)
    public void testAddToCart() throws InterruptedException {

        loginPage.login("standard_user", "secret_sauce");
        String expectedResult = "Sauce Labs Backpack";
        addToCart.addingToCart();
        String actualResult = addToCart.getStatus().getText();
        Assert.assertEquals(actualResult,expectedResult);

    }
    @org.testng.annotations.Test (priority = 1)
    public void testCheckOut() throws InterruptedException {
        String expectedResult = "THANK YOU FOR YOUR ORDER";
        loginPage.login("standard_user", "secret_sauce");
        addToCart.addingToCart();
        yourCart.checkingOut();
        checkOut.insertData();
        checkoutOverview.finishing();
        String actualResult =checkoutComplete.getMessage().getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @org.testng.annotations.Test (priority = 4)
    public void testLogout() throws InterruptedException {
        String expectedResult = "Login";
        loginPage.login("standard_user", "secret_sauce");
        logout.loggingOut();
        String actualResult = logout.getLoginBtn().getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }

    @org.testng.annotations.Test (priority = 5)
    public void testAddingToCartWithoutLogin(){
        String expectedResult = "Epic sadface: You can only access '/cart.html' when you are logged in.";
        driver.get("https://www.saucedemo.com/cart.html");
        String actualResult = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        Assert.assertEquals(actualResult,expectedResult);

    }






    }
