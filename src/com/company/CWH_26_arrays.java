package com.company;

public class CWH_26_arrays {
    public static void main(String[] args) {
        /* There are three main ways of creating array
        1st method
        int [] marks = new int[5]; //Declaration and memory allocation
        marks[0]=100;//Initialization
        marks[1]=90;
        marks[2]=85;
        marks[3]=70;
        marks[4]=80;
        System.out.println(marks[4]);

        2nd method
        int [] marks;//Declaration
        marks = new int[5];//Memory allocation
        marks[0]=100;//Initialization
        marks[1]=90;
        marks[2]=85;
        marks[3]=70;
        marks[4]=80;
         */

        //3rd method
        //Declaration, memory allocation and initialization together

        int [] marks = {100,90,85,70,80};
        System.out.println(marks[2]);
    }
}
