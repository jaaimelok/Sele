package ru.stqa.selenium.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPCertificaciones {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("");
        options.setCapability("proxy", proxy);
        WebDriver driver = new ChromeDriver();
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());


    }
}
