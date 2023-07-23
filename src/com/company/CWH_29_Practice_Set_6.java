package com.company;
import java.util.Scanner;
public class CWH_29_Practice_Set_6 {
    public static void main(String[] args) {
        //Question-1
        /*
        float[] marks = {95.7f,98.7f,99.8f,95.3f,95.5f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println(sum);
        float sum1 = 0 ;
        for(int i = 0;i< marks.length;i++){
            sum1 = sum1 + marks[i];
        }
        System.out.println("The sum elements in the array is: "+ sum1);

         */
        //Question-2
        /*
        int [] marks = {99,98,97,96,95};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean num_present = false;

        for (int i = 0;i<marks.length;i++){
            if(num==marks[i]){
                num_present = true;
                break;
            }
        }
        if(num_present){
            System.out.printf("The number %d is present in the array",num);
        }
        else {
            System.out.printf("The number %d is not present in the array", num);
        }

         */

            //OR
            /*
            for(int element: marks){
                if(num==element){
                    num_present=true;
                    break;
                }
            }
            if(num_present){
                System.out.printf("The number %d is present in the array",num);
            }
            else {
                System.out.printf("The number %d is not present in the array",num);

            }

             */
        //Question-3

        /*
        float [] marks_physics = {98.5f,98.0f,97.5f,96.0f,95.5f};
        float sum = 0;
        for(float element: marks_physics){
            sum = sum + element;
        }
        System.out.println("The average marks of 5 students in physics is: "+(sum/marks_physics.length));

         */

        //Question-4
        /*
        int [][] mat1 = {{9,2,7},{4,5,6}};
        int [][] mat2 = {{1,8,3},{6,5,8}};
        int [][] result = {{0,0,0},{0,0,0}};

        for(int i=0;i< mat1.length;i++){   //row number of times
            for(int j=0;j<mat1[i].length;j++){    //column number of times
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];

            }

        }
        //Printing the elements of the 2-D array
        for(int i=0;i< mat1.length;i++){   //row number of times
            for(int j=0;j<mat1[i].length;j++){   //column number of times
                System.out.print(result[i][j]+ " ");
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println(""); //Print a new line

        }

         */


    }
}
