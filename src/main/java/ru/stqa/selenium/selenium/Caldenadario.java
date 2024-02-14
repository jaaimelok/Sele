package ru.stqa.selenium.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Caldenadario
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/international-flights/?cmp=SEM|D|IF|B|Brand|IF_Brand_Exact-Ex_India|Brand_Exact_Ex_india|RSA|Regular|NewFunnel|&s_kwcid=AL!1631!3!!e!!o!!makemytrip&ef_id=:G:s");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        Thread.sleep(5000);
        List<WebElement> dates = driver.findElements(By.xpath("//div[@class='dateInnerCell']"));
        System.out.println(dates);
        int tamano = driver.findElements(By.xpath("//div[@class='dateInnerCell']")).size();
        Thread.sleep(5000);

        for (int i=0;i<tamano;i++){
            String text=driver.findElements(By.xpath("//div[@role='gridcell']")).get(i).getText();
            if(text.equalsIgnoreCase("29\n" +
                    "₹ 5,256")){
                driver.findElements(By.xpath("//div[@role='gridcell']")).get(i).click();
                System.out.println(i);
                break;
            }

            }
            }
        }


