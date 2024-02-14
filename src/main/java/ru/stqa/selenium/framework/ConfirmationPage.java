package ru.stqa.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stqa.selenium.AbstractComponents.AbstractComponents;

public class ConfirmationPage extends AbstractComponents {

    WebDriver driver;


    public ConfirmationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".hero-primary")
    WebElement confrimationMessage;

    public String verifyconfirmationmessage(){
        return confrimationMessage.getText();

    }
}
