package ru.stqa.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stqa.selenium.AbstractComponents.AbstractComponents;

import java.util.List;

public class Productcataloge extends AbstractComponents {
    WebDriver driver;

    public Productcataloge(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//List<WebElement> opciones =driver.findElements(By.cssSelector(".mb-3"));

    @FindBy(css = ".mb-3")
    List<WebElement> opciones;

    @FindBy(css = ".ng-animating")
    WebElement spinner;



    By opciones1 = By.cssSelector(".mb-3");
    By addtocart = (By.cssSelector(".card-body button:last-of-type"));
    By toastMesage= (By.xpath("//div[@id='toast-container']"));


    public List<WebElement> getopcionesList() {
        WaitForElementToAppear(opciones1);
        return opciones;
    }

    public WebElement getProductbyName(String productName) {
        WebElement prod = opciones.stream().filter(opcione ->
                opcione.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
        return prod;


    }

    public  void addProductTOCART(String productName) throws InterruptedException {
        WebElement prod = getProductbyName(productName);
        prod.findElement(addtocart).click();
        WaitForElementToAppear(toastMesage);
        WaitforElementoToDissapear(spinner);

    }
}

