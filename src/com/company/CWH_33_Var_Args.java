package com.company;

public class CWH_33_Var_Args {
//    static int sum(int a ,int b){
//        return a+b;
//    }
//    static int sum(int a ,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a ,int b,int c,int d){
//        return a+b+c+d;
//    }
    static int sum(int x,int ...arr){
        //Available as int [] arr;
        int result = x;
//        for(int element:arr){
//            result +=element;
//        }
        for(int i=0;i<arr.length;i++){
            result+= arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum is: "+ sum(1));
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of numbers is: "+ sum(4,5,6));
        System.out.println("The sum of numbers is: "+ sum(4,5,6,7,7,8,3,4,2));

    }
}
