package com.company;

public class CWH_multi_dim_arrays {
    public static void main(String[] args) {
        int [] marks;    //1D Array
        int [][] flats = new int[2][3]; //2D Array
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;
        System.out.println("Printing the 2D array");
        for(int i =0;i< flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
