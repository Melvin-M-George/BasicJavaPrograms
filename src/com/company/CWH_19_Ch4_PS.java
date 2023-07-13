package com.company;
import java.util.Scanner;
public class CWH_19_Ch4_PS {
    public static void main(String[] args) {
        //Question-1
//        int a = 11;
//        if(a = 11){
//
//        }

        //Question-2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter mark of subject 1");
//        int mark1 = sc.nextInt();
//        System.out.println("Enetr mark of subject 2");
//        int mark2 = sc.nextInt();
//        System.out.println("Enetr mark of subject 3");
//        int mark3 = sc.nextInt();
//
//        int scored_total = mark1+mark2+mark3;
//
//        System.out.println("Enter total possible marks of three subjects");
//        int total_marks = sc.nextInt();
//
//        float total_passmark = (float)total_marks*40/100;
//        float subject_passmark = (float) total_marks/3 * (33/100);
//
//        if(mark1 >= subject_passmark && mark2 >= subject_passmark
//                && mark3 >= subject_passmark && scored_total >= total_passmark){
//            System.out.println("The student passed");
//        }
//        else {
//            System.out.println("The student failed");
//        }

        //Question-3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your annual salary (in lakhs) ");
//        float income = sc.nextFloat();
//        float tax = 0f;
//
//        if(income<=2.5f){
//            tax = tax + 0;
//        }
//        if(income>2.5f && income<=5f){
//            tax = tax + 0.05f*(5.0f-2.5f);
//        } else if (income > 5f && income <= 10f) {
//            tax = tax + 0.05f*(5f-2.5f);
//            tax = tax + 0.2f*(income-5f);
//
//        } else if (income > 10f) {
//            tax = tax + 0.05f*(5f-2.5f);
//            tax = tax + 0.2f*(10f-5f);
//            tax = tax + 0.3f*(income-10f);
//        }
//        System.out.println("The total tax paid by the employee is :"+ tax);
//

        //Question-4
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //Question-5
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a year");
//        int year = sc.nextInt();
//        if(year%400==0 || (year%4==0 && (year%100!=0))){
//            System.out.println("The year is leap year");
//        }
//        else{
//            System.out.println("The year is not leap year");
//        }
        //Question-6
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian website");
        }
    }
}
