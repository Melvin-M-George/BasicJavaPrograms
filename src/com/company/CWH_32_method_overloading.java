package com.company;

public class CWH_32_method_overloading {
    static void foo(){
        System.out.println("Good Morning!");
    }
    static void foo(int a){
        System.out.println("Good Morning!"+ "Time is "+ a);
    }
    static void foo(int a,int b){
        System.out.println("Good Morning!"+ "Time is "+ a +":"+b);
    }
    static void changeInteger(int a){
        a = 98;
    }
    static void changeArray(int [] arr){
        arr[0] = 98;
    }
    static void sayGoodMorning(){
        System.out.println("Good Morning!");
    }

    int sum(int a,int b){
        return a+b;
    }


    public static void main(String[] args) {
//        sayGoodMorning();
//        CWH_32_method_overloading obj = new CWH_32_method_overloading();
//        int x = 2;
//        int y = 3;
//        int c = obj.sum(x,y);
//        System.out.println(c);
        //Case 1 - changing the integer
//        int x = 45;
//        changeInteger(x);
//        System.out.println("The value of x after running changeInteger is:"+ x);

//        Case 2 - changing the array
//        int [] marks = {91,99,95,97,99};
//        changeArray(marks);
//        System.out.println("The value after running changeArray is: "+ marks[0]);



        //Method Overloading
        foo();
        foo(10);
        foo(10,15);// Arguments are Actual


    }
}
