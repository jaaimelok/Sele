package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver ","C:\\Users\\Jaime\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("jaime");
        driver.findElement(By.name("inputPassword")).sendKeys("calderon");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jaime");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jaimeee");
        driver.findElement(By.cssSelector("input[placeholder='Email'] ")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jaimito");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("312421421");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("jaime");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("jaimecalderon");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath(" //button[@class='submit signInBtn']")).click();


        }







    }





