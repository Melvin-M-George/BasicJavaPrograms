package com.company;

public class CWH_31_methods {
    static int logic(int x ,int y){
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
        CWH_31_methods obj = new CWH_31_methods();
        int c = obj.logic(3,4);

//        int c = logic(1,6);
        System.out.println(c);

    }
}
