package ru.stqa.selenium.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActividadScopes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        String texto= driver.findElement(By.xpath("//label[@for='benz']")).getText();
        WebElement Dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown= new Select(Dropdown);
        dropdown.selectByVisibleText(texto);
        driver.findElement(By.id("name")).sendKeys(texto);
        driver.findElement(By.xpath("//input[@value='Alert']")).click();





    }
}
