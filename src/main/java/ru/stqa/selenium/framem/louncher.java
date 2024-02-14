package ru.stqa.selenium.framem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class louncher {

    public static void main(String[] args) throws InterruptedException {

        String[] productos = {"Banana - 1 Kg", "Mushroom - 1 Kg"};
        List productoslist = Arrays.asList(productos);


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/practice-project");
        driver.findElement(By.id("name")).sendKeys("jaime");
        driver.findElement(By.id("email")).sendKeys("jaimecbescuela@hotmail.com");
        driver.findElement(By.id("form-submit")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(.,'Automation Practise - 1')]")).click();
        List<WebElement> nombreproductos = driver.findElements(By.xpath("//h4[@class='product-name']"));
        for (int i = 0; i < nombreproductos.size(); i++) {
            String dato = nombreproductos.get(i).getText();
            if (dato.contains("Banana - 1 Kg")) {
                driver.findElements(By.xpath("//button[contains(.,'ADD TO CART')]")).get(i).click();
            }


        }

        for (int i = 0; i < nombreproductos.size(); i++) {
            String dato = nombreproductos.get(i).getText();
            if (dato.contains("Mushroom - 1 Kg")) {
                driver.findElements(By.xpath("//button[contains(.,'ADD TO CART')]")).get(i).click();
            }
        }
        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        driver.findElement(By.xpath("//button[contains(.,'PROCEED TO CHECKOUT')]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//button[contains(.,'Place Order')]")).click();
        driver.findElement(By.xpath("//select[@style='width: 200px;']")).sendKeys("Mexico");
        driver.findElement(By.xpath("//select[@style='width: 200px;']")).click();



    }
}

