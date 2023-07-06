package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark of 1st subject");
        float a = sc.nextInt();
        System.out.println("Enter mark of 2nd subject");
        float b = sc.nextInt();
        System.out.println("Enter mark of 3rd subject");
        float c = sc.nextInt();
        System.out.println("Enter mark of 4th subject");
        float d = sc.nextInt();
        System.out.println("Enter mark of 5th subject");
        float e = sc.nextInt();

        float sum = a + b + c + d + e ;
        System.out.println("Total Scored marks is : " + sum);

        System.out.println("Enter total marks");
        float totalmarks = sc.nextInt();

         float percentage = (float) (sum*100/totalmarks);
        System.out.println("Percentage is :" + percentage);





    }
}
