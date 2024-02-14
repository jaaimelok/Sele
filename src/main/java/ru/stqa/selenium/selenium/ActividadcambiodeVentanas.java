package ru.stqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ActividadcambiodeVentanas {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(.,'Multiple Windows')]")).click();
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
        driver.switchTo().window(parentid);
        System.out.println(driver.findElement(By.xpath("//h3[contains(.,'Opening a new window')]")).getText());




    }
}
