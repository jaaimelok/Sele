package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class TableGrids2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         List<WebElement> datos = driver.findElements(By.xpath("//table[@name='courses']//td[3]"));
         int sum =0;

         for(int i=0;i< datos.size();i++){
           sum = sum + Integer.parseInt(datos.get(i).getText());

         }
        System.out.println(sum);

        Assert.assertEquals(235,sum);
    }


}

