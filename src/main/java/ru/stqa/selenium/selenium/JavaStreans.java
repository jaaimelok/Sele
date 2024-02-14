package ru.stqa.selenium.selenium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


    public class JavaStreans {

        @Test
        public void regular(){

            List<String> names = new ArrayList<String>();
            names.add("Ana");
            names.add("Diego");
            names.add("Alex");
            names.add("Andres");
            names.add("Ramon");
            int count = 0;

            for (int i = 0; i < names.size(); i++) {

                String actual = names.get(i);
                if (actual.startsWith("A")) {
                    count++;

                }
            }
            System.out.println(count);

        }
@Test
        public void StreamFilter(){
    List<String> names = new ArrayList<String>();
    names.add("Ana");
    names.add("Diego");
    names.add("Alex");
    names.add("Andres");
    names.add("Ramon");
    Long c =names.stream().filter(s -> s.startsWith("D")).count();
    System.out.println(c);
    }

}


