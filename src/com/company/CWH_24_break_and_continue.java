package com.company;

public class CWH_24_break_and_continue {
    public static void main(String[] args) {
//        for(int i = 0;i<5;i++){
//            System.out.println(i);
//            if (i==3){
//                System.out.println("The loop ends here");
//                break;
//            }
//        }


        for(int i = 0;i<5;i++){
            if (i==2){
                System.out.println("The loop ends here");
                continue;
            }
            System.out.println(i);

        }
    }
}
