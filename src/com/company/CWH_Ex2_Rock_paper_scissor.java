package com.company;
import java.util.Random;
import java.util.Scanner;
public class CWH_Ex2_Rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is rock paper scissor game.In this game" +" "+
                "0 represents rock,1 represents paper and 2 represents scissor");
        System.out.println("Enter a number 0 or 1 or 2");

        int num = sc.nextInt();
        if(num==0){
            System.out.println("Rock");
        } else if (num==1) {
            System.out.println("Paper");
        }
        else if(num==2){
            System.out.println("Scissor");
        }


        Random rand = new Random();
        int upperbound = 3;
        int int_random = rand.nextInt(upperbound);
        System.out.println(int_random);
        if(int_random==0){
            System.out.println("Rock");
        }
        else if (int_random==1) {
            System.out.println("Paper");
        }
        else if(int_random==2){
            System.out.println("Scissor");
        }



        if(num==0 && int_random==0){
            System.out.println("Draw!! Play again");
        }
        else if(num==0 && int_random==1){
            System.out.println("You lost!");
        }
        else if(num==0 && int_random==2){
            System.out.println("You Win!");
        }




        if(num==1 && int_random==0){
            System.out.println("You Win!");
        }
        else if(num==1 && int_random==1){
            System.out.println("Draw ! Play again");
        }
        else if(num==1 && int_random==2){
            System.out.println("You lost!");
        }



        if(num==2 && int_random==0){
            System.out.println("You Lost!");
        }
        else if(num==2 && int_random==1){
            System.out.println("You Win!");
        }
        else if(num==2 && int_random==2){
            System.out.println("Draw! Play again");
        }

    }
}
