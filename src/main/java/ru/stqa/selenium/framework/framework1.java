package ru.stqa.selenium.framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class framework1 {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/client/");
        Landingpage Lamdingpage = new Landingpage(driver);
        driver.findElement(By.id("userEmail")).sendKeys("jaimecbescuela@hotmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Secretariojaime99*");
        driver.findElement(By.id("login")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

        List<WebElement> opciones =driver.findElements(By.cssSelector(".mb-3"));
        WebElement prod = opciones.stream().filter(opcione->
                opcione.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
        driver.findElement(By.xpath("//button[@style='margin-top: -10px;'][contains(.,'Cart')]")).click();

        List<WebElement> carro =    driver.findElements(By.xpath("//div[@class='cartSection']//h3"));
        Boolean match =carro.stream().anyMatch(carroprd-> carroprd.getText().equalsIgnoreCase("ZARA COAT 3"));
        Assert.assertTrue(match);
        driver.findElement(By.xpath("//div[@class='subtotal cf ng-star-inserted']//button")).click();
        driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("Mexico");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//span[@class='ng-star-inserted']"))).click().build().perform();
        driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
        String teexto = driver.findElement(By.cssSelector(".hero-primary")).getText();
        Assert.assertTrue(teexto.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
        driver.close();









    }
}
