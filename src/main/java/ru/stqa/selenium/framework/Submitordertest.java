package ru.stqa.selenium.framework;


import TestComponents.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Submitordertest extends BaseTest {


        @Test
        public void submitorder () throws IOException, InterruptedException {


            String productName = "ZARA COAT 3";

            Productcataloge productcataloge = landingpage.loginAplication("jaimecbescuela@hotmail.com", "Secretariojaime99*");



            List<WebElement> productss = productcataloge.getopcionesList();
            productcataloge.addProductTOCART(productName);
            CartPage cartPage = productcataloge.goToCartPage();

            Boolean match = cartPage.VerifyProductDisplay(productName);
            Assert.assertTrue(match);
            CheckoutPage checkoutPage = cartPage.goToCheckout();
            checkoutPage.setSelectCountry("Mexico");
            ConfirmationPage confirmationPage = checkoutPage.submitorder();
            String confirmmessage = confirmationPage.verifyconfirmationmessage();

            Assert.assertTrue(confirmmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));



        }
    }

