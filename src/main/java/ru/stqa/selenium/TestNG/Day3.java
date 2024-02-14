package ru.stqa.selenium.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Day3 {

    @BeforeClass
    public void beforeclass(){


        System.out.println("beforeclass");
    }
    @Test(groups = "Smoke")
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
    @Test
    public void Mobilelogin2(){


        System.out.println("Mobile");
    }
    @AfterMethod
    public void aftermethod(){


        System.out.println("aftermethod");
    }
    @Test
    public void Mobilelogin3() {


        System.out.println("Mobile");
    }
        @Test
        public void Mobilelogin4(){


            System.out.println("Mobile");
        }
    }

