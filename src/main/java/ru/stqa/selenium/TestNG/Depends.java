package ru.stqa.selenium.TestNG;

import jdk.jfr.Enabled;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Depends {

    @BeforeClass
    public void beforeclass(){


        System.out.println("beforeclass");
    }
    @Test(dependsOnMethods = {"Mobilelogin2"})
    public void Webllogin(){


        System.out.println("selenium");
    }
    @Test
    public void Mobilelogin(){


        System.out.println("Mobile");
    }
    @Test
    public void Apillogin(){


        System.out.println("apui");
    }
    @BeforeMethod
    public void BeforMethod(){


        System.out.println("beforemethod");
    }
    @Test()
    public void Mobilelogin2(){


        System.out.println("Mobile");
    }
    @AfterMethod
    public void aftermethod(){


        System.out.println("aftermethod");
    }
    @Test(enabled = false)
    public void enablee() {


        System.out.println("enable");
    }
    @Test
    public void Mobilelogin4(){


        System.out.println("Mobile");
    }
}

