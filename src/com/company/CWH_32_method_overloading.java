package com.company;

public class CWH_32_method_overloading {
    static void sayGoodMorning(){
        System.out.println("Good Morning!");
    }

    int sum(int a,int b){
        return a+b;
    }


    public static void main(String[] args) {
        sayGoodMorning();
        CWH_32_method_overloading obj = new CWH_32_method_overloading();
        int x = 2;
        int y = 3;
        int c = obj.sum(x,y);
        System.out.println(c);
    }
}
