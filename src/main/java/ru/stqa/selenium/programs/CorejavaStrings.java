package ru.stqa.selenium.programs;

public class CorejavaStrings {
    public static void main(String[] args) {


        // string is an object

        String s1 = "jaime calderon bonilla ";

        String s2 = new String("welcome");
        String s = "jaime calderon bonilla ";
        String[] splitString = s.split(" ");
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);
        System.out.println(splitString[2]);
        System.out.println(splitString[1].trim());

        for (int i = s.length()-1;i>=0;i -- ){
            System.out.println(s.charAt(i));
        }
       }


    }

