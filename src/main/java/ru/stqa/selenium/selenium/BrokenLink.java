package ru.stqa.selenium.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BrokenLink {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        //obtner todos los URl que que tienen los links
        //metodo de java va a obtenr el codigo de status
        // si es un codigo 400 se dice que est roto


        driver.get("https://rahulshettyacademy.com/AutomationPractice/" );
        SoftAssert A = new SoftAssert();
         String url = driver.findElement(By.xpath("//a[contains(.,'SoapUI')]")).getAttribute("href");
        HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int responseCode =conn.getResponseCode();
        System.out.println(responseCode);;
        Assert.assertTrue(responseCode<400, "codigo malo ");
        int response =conn.getResponseCode();
        System.out.println(response);

    }

}
