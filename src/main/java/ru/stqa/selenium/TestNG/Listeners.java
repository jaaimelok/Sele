package ru.stqa.selenium.TestNG;


import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
    @Override
    public void  onTestSuccess (ITestResult result){
        System.out.println("todo bien");
    }




}
