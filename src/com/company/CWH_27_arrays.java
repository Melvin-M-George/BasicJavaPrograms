package com.company;

public class CWH_27_arrays {
    public static void main(String[] args) {
        /*  float [] marks = {100.0f,98.5f,80.5f,79.7f,97.8f};
         String [] name = {"Sasi","Soman","Purushu","Vasu annan","Thomaskutty"};
          System.out.println(marks.length);
        */

        int [] marks = {100,90,80,70,85};
//        for(int i = 0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        System.out.println("Printing array elements in reverse order");
//        for(int i= marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }

        for(int element: marks){
            System.out.println(element);
        }
    }
}
