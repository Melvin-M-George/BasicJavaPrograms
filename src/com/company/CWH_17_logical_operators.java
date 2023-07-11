package com.company;

public class CWH_17_logical_operators {
    public static void main(String[] args) {
        System.out.println("For Logical AND....");
        boolean a = true;
        boolean b = false;
        boolean c = true;

        if ( a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical OR....");
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;

        if ( a1 || b1 || c1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical NOT");
        System.out.print("NOT a is :");
        System.out.println(!a);
        System.out.print("NOT b is :");
        System.out.println(!b);

    }
}
