package ru.stqa.selenium.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practica1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Jaime\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("jaimecbescuela@hotmail.com");
        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Secretariojaime99*");
        driver.findElement(By.cssSelector("button[name='login']")).click();
        driver.findElement(By.id("email")).sendKeys("jaimegearsofwar2@hotmail.com");
        driver.findElement(By.name("pass")).sendKeys("Secretariojaime99*");
        driver.findElement(By.linkText("¿Olvidaste tu contraseña?")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='_9nq2 marginBottom16px']")).getText(),("Ingresa tu correo electrónico o número de celular para buscar tu cuenta."));









    }
}
