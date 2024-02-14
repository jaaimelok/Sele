package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obtenerunapartedeuntexto {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Jaime\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
        driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("jaimecbescuela");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);







    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        String passwordtext = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login
        String[]  passwordarray = passwordtext.split("'");
        //0th index --please use temporary password
        //1th index--- rahulshettyacademy to login.
        String password = passwordarray[1].split("'")[0];
        return password;


        //0th index --rahulshettyacademy
        //1th index--- to login






    }
}
