package com.company;
import java.util.*;
public class sqrt {
    static void check(int num){
        double sq=Math.sqrt(num);
        if((sq*sq)==num){
            System.out.println("prefect square");
        }
        else{
            System.out.println("not a perfect square");
        }
    }
    public static void main(String args[]){
        System.out.println("enter the num");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        check(num);

    }

}
