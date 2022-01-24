package com.company;

import java.util.*;
class calu{
    calu(float a, float b){
        float c = a*b;
        System.out.println("area of rectrangle is : " + c);
    }
    calu(float a){
        float c=a*a;
        System.out.println("area of square is : " + c);

    }
}

public class shape {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int len,bre;
        System.out.println("enter the len and bre");
        len=s.nextInt();
        bre=s.nextInt();
        calu c= new calu(len,bre);
        System.out.println("enter the side for square");
        int side=s.nextInt();
        calu q =new calu(side);
    }
}
