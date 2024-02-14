package ru.stqa.selenium.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.selenium.framework.CartPage;

import java.time.Duration;

public class AbstractComponents {


    WebDriver driver;


    public AbstractComponents(WebDriver driver) {
        this.driver = driver;
    PageFactory.initElements(driver,this);
}

    @FindBy(xpath="//button[@style='margin-top: -10px;'][contains(.,'Cart')]")
    WebElement cartHeader;

    public void WaitForElementToAppear(By findBy) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

    }
    public CartPage goToCartPage(){
        cartHeader.click();
        CartPage cartPage = new CartPage(driver);
        return cartPage;

    }
    public  void WaitforElementoToDissapear(WebElement ele) throws InterruptedException {

        Thread.sleep(1000);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        //wait.until(ExpectedConditions.invisibilityOf(ele));
    }
}
