package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonprueba {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Jaime\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.mx/ref=nav_logo");
        driver.findElement(By.xpath("//header/div/div/div[5]")).click();


    }
}
