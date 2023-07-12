package com.company;
import java.util.Scanner;
public class CWH_18_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to be an Adult!");
                break;
            case 23:
                System.out.println("You are going to get a job!");
                break;
            case 28:
                System.out.println("You are going to get married!");
                break;
            case 56:
                System.out.println("You are going to get retired! ");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        /*
        OR (No need of using "break" here)
        switch (age) {
            case 18 -> System.out.println("You are going to be an Adult!");
            case 23 -> System.out.println("You are going to get a job!");
            case 28 -> System.out.println("You are going to get married!");
            case 56 -> System.out.println("You are going to get retired! ");
            default -> System.out.println("Enjoy your life!");
        }


        */


        /*
        if(age>56){
            System.out.println("You are Experienced");
        }
        else if (age>36) {
            System.out.println("You are semi-Experienced");
        }
        else if (age>26){
            System.out.println("You are less experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
         */


    }
}
