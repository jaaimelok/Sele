package ru.stqa.selenium.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day1 {
    @Parameters({"URL"})
    @Test
public void Demo(String urlname){


        System.out.println("hola");
        System.out.println(urlname);
    }


    @Test(dataProvider ="getData")
    public void DemoURL(String username, String password){
        System.out.println(username);
        System.out.println(password);


        System.out.println("holann");
    }

    @DataProvider
    public Object getData(){


        System.out.println("holann");
        Object[][] data = new Object[3][2];
        data[0][0] = "primeroU";
        data[0][1]= " password";
        data[1][0]="secondu";
        data[1][1]="secondpass";
        data[2][0]="thirdyu";
        data[2][1]="thirdpass";{
            return data;
        }



    }
}
