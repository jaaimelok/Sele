package ru.stqa.selenium.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sabersiarrayespar {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122};
        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                break;

            } else {
                System.out.println(arr2[i] + " not multiple of 2");
            }
        }
        ArrayList<String>  a = new ArrayList<String> ();
        //crate array que puede seguri creciendo
        a.add("jaime");
        a.add("calderon");
        a.add("nombre");
        a.add("selenium");
        System.out.println(a.get(3));

        for(int i =0 ;i<a.size();i++){
            System.out.println(a.get(i));
        }
        System.out.println("******");
        for (String val :a){
            System.out.println(val);
        }
//item is present in arraylist
        System.out.println(a.contains("jaime"));
        String[] name = {"jaime","calderon","bonilla"};
        List<String> nameArrayList = Arrays.asList(name);


    }





}


