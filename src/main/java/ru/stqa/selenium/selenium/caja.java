package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class caja {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> opciones = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for(int i=0;i<opciones.size();i++){
            String datos =driver.findElements(By.xpath("//h4[@class='product-name']")).get(i).getText();
            if(datos.contains("Brinjal - 1 Kg")){
                driver.findElements(By.xpath("//button[@type='button']")).get(i).click();
                break;
            }


            }
        }


    }

