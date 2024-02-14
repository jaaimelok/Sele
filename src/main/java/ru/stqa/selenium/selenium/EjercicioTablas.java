package ru.stqa.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EjercicioTablas {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      List<WebElement> fila =  driver.findElements(By.xpath("//table[@name='courses']//td[3]"));
        int FILa = fila.size();
        List<WebElement> nombrefila = driver.findElements(By.xpath("//table[@name='courses']//th[3]"));
        int titfila = nombrefila.size();
        int sumafilas = FILa + titfila;
        System.out.println("Cantidad de filas "+ " "+ sumafilas);
        List<WebElement> columnas = driver.findElements(By.xpath("//table[@name='courses']//th"));
        int cantidadcolumnas = columnas.size();
        System.out.println("Cantidad de columnas "+ " "+ cantidadcolumnas);
        System.out.println(driver.findElement(By.xpath("//table[@id='product']//tr[3]")).getText());














    }
}
