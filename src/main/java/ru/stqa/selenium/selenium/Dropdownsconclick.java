package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//TestNG is one of the testing framework


public class Dropdownsconclick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());
        Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        Thread.sleep(2000);
        for (int i=0;i<4;i++){
            driver.findElement(By.id("hrefIncAdt")).click();


        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),("5 Adult"));
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();


    }
}
