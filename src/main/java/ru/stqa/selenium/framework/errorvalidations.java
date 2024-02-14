package ru.stqa.selenium.framework;


import TestComponents.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class errorvalidations extends BaseTest {


        @Test
        public void submitorder () throws IOException, InterruptedException {

            String productName = "ZARA COAT 3";

            Productcataloge productcataloge = landingpage.loginAplication("jaimecbescuela@hotmail.com", "Secretarijojaime99*");
            Assert.assertEquals("Incorrect email or password.",landingpage.getErrorMessage());







        }
    }

