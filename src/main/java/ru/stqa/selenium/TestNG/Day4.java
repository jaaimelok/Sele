package ru.stqa.selenium.TestNG;

import org.testng.annotations.*;


public class Day4 {
    @Test
public void WeblloginHome(){


        System.out.println("selenium home");
    }
    @Test(groups = "Smoke")
    public void MobileloginHome(){


        System.out.println("Mobilehome");
    }
    @AfterTest
    public void Apilloginhome(){


        System.out.println("apihomew finaaalll");
    }
    @BeforeSuite
    public void beforesuite(){


        System.out.println("beforeeesuitte");
    }

    @AfterSuite
    public void aftersuite(){


        System.out.println("aftersuite");
    }
}
