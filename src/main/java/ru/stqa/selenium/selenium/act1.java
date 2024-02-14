package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.lang.model.element.Element;
import java.util.List;

public class act1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@value='option1']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
        driver.findElement(By.xpath("//input[@value='option1']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isEnabled());
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());






    }
}
