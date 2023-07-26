package com.company;

public class CWH_32_method_overloading {
    static void sayGoodMorning(){
        System.out.println("Good Morning!");
    }

    static int sum(int a,int b){
        return a+b;
    }


    public static void main(String[] args) {
        sayGoodMorning();
        int c = sum(4,3);
        System.out.println(c);
    }
}
