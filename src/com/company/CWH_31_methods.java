package com.company;

public class CWH_31_methods {
     int logic(int x ,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        //        int c = logic(a,b);
        int a = 10;
        int b = 6;
        CWH_31_methods obj = new CWH_31_methods();
        int c = obj.logic(a,b);
        System.out.println(c);

    }
}
