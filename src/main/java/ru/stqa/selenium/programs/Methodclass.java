package ru.stqa.selenium.programs;

public class Methodclass {
    public static void main(String[] args) {

        Methodclass d = new Methodclass();
        d.getData();
        String name = d.getData();
        System.out.println(name);
        methodsdemo2 d1 = new methodsdemo2();
        d1.getUserData();
        getData2();



    }

    public static String getData() {
        System.out.println("Hellow world");
        return "jaime ";
    }

    public static String getData2() {
        System.out.println("Hellow world");
        return "jaime ";

    }
}

