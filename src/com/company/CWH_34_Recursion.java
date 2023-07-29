package com.company;

public class CWH_34_Recursion {
    //factorial(0) = 1;
    //factorial(5)= 5*4*3*2*1;
    //factorial(n) = n * factorial(n-1);
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int factorial_Iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for(int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("The factorial value of is: " + factorial(x) );
        System.out.println("The factorial value of is: " + factorial_Iterative(x) );

    }
}
