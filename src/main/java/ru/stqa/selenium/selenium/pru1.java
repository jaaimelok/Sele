package ru.stqa.selenium.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class pru1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
        driver.manage().window().maximize();
        String[] veggies = {"Cucumber","Cauliflower"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i=0;i<products.size();i++){


            //Brocolli - 1 Kg

          String[] name = products.get(i).getText().split("-");
         String formattedname = name[0].trim();

          List veggieslist = Arrays.asList(veggies);
          if(veggieslist.contains(formattedname)){



              driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
              driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();


          }

        }
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(.,'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("hokla");


        }



    }

