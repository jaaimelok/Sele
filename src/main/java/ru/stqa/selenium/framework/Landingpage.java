package ru.stqa.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stqa.selenium.AbstractComponents.AbstractComponents;

public class Landingpage extends AbstractComponents {
    WebDriver driver;

    public Landingpage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

   // WebElement useremail =  driver.findElement(By.id("userEmail"));
    @FindBy(id="userEmail")
    WebElement useremail;

    @FindBy(id="userPassword")
    WebElement passwordEle;

    @FindBy(id="login")
    WebElement submit;

    @FindBy(css="[class*= 'flyInOut']")
    WebElement errorMessage;

    public  Productcataloge loginAplication(String email, String password){
        useremail.sendKeys(email);
        passwordEle.sendKeys(password);
        submit.click();
        Productcataloge productcataloge = new Productcataloge(driver);
        return productcataloge;




    }

    public String getErrorMessage(){


        WaitForWebElementToAppear(errorMessage);



        return errorMessage.getText();

    }

    public void goURl(){
        driver.get("https://rahulshettyacademy.com/client/");
    }

}
