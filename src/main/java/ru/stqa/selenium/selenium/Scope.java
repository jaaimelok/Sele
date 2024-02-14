package ru.stqa.selenium.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(Footerdriver.findElements(By.tagName("a")).size());

        WebElement columna = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columna.findElements(By.tagName("a")).size());

        for(int i =1 ; i<columna.findElements(By.tagName("a")).size();i++) {

            String clicklink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columna.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
            Thread.sleep(5000L);

        }
            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator();

            while (it.hasNext()){
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());

            }






        }





    }


