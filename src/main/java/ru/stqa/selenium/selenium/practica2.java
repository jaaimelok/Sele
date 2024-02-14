package ru.stqa.selenium.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practica2 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("hola");
        driver.findElement(By.name("email")).sendKeys("jaime.calderon");
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("JAIME CALDERON ");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement lista = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(lista);
        dropdown.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();


    }
}
