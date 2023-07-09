package com.company;

public class CWH_09_ch2_Precedence {
    public static void main(String[] args) {
        /*
        int a = 6*5-34/2;
        int b = 60/5-34*2;
        System.out.println(a);
        System.out.println(b);
         */
        // Precedence and Associativity


        //Quick Quiz
        int x = 6;
        int y = 1;
//        int k = x * y/2;
        int a = 5;
        int b = 1;
        int c = 4;
        int k = (b*b) - (4*a*c)/(2*a);
        System.out.println(k);


    }
}
