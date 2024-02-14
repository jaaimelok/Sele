package ru.stqa.selenium.programs;

public class Corejava1 {
    public static void main(String[] args) {
        int num = 5;
        String nombre = "Jaime Calderon";
        char letra = 'r';
        double nem = 4.09;
        boolean por = true;

        System.out.println(nombre + " " + num + " " + nem + " " + por);


        // array

        int[] arr = new int[5];
        arr[0] =1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = {1,2,3,4,5};

        //for loop
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);

        }



    }
}

