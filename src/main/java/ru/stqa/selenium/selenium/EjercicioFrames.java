package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjercicioFrames {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(.,'Nested Frames')]")).click();
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}