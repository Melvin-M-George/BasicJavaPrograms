package com.company;
import java.util.Scanner;
public class CWH_25_PS_loops {
    public static void main(String[] args) {

        //Question-1
//        for(int i = 4;i>0;i--){
//            for(int j = 0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //Question-2
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i =0;i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.print(sum);

        //Question-3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.print(i+"x"+n+"=");
            System.out.println(i*n);

        }

    }
}
