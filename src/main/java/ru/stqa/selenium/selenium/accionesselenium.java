package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class accionesselenium {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.className("blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        String parentId=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
        driver.findElement(By.xpath("//p[@class='im-para \nred']")).getText().split("at");






    }

}
