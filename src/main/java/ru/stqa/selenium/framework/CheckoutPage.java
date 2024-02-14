package ru.stqa.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stqa.selenium.AbstractComponents.AbstractComponents;

public class CheckoutPage extends AbstractComponents {

    WebDriver driver;


    public CheckoutPage(WebDriver driver){
        super(driver);
        this.driver =driver;
        PageFactory.initElements(driver, this);


    }
    @FindBy(css = ".action__submit")
   WebElement submit;

    @FindBy(xpath = "//input[@placeholder='Select Country']")
   WebElement country ;

    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    WebElement selectCountry ;
    By results = By.xpath("//span[@class='ng-star-inserted']");


    public void setSelectCountry(String countryName){
        Actions a = new Actions(driver);
        a.sendKeys(country,countryName).build().perform();
        WaitForElementToAppear(By.xpath("//a[@class='btnn action__submit ng-star-inserted']"));
        selectCountry.click();



    }
    public ConfirmationPage submitorder()
    {

        submit.click();
        return  new ConfirmationPage(driver);



    }

}
