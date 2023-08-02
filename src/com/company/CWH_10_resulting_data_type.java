package com.company;

public class CWH_10_resulting_data_type {
    public static void main(String[] args) {

        /*
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.45f + x;

         */
         int i = 56;
         // int b = i++;  //first b is assigned i(56) and then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented and then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y = 7;
        System.out.println(++y * 8);
        char ch = 'a';
        System.out.println(++ch);

    }
}
