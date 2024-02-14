package ru.stqa.selenium.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Day2 {
    @Test
public void Demo(){


        System.out.println("hola");
    }
    @BeforeTest
    public void prerequiste(){
        System.out.println("antess deee");
    }
}


