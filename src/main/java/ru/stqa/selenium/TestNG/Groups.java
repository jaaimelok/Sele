package ru.stqa.selenium.TestNG;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "Smoke")
    public void ploan(){
        System.out.println("hola");

    }

}
