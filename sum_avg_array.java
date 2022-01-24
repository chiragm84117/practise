package com.company;

import java.util.*;

public class sum_avg_array {
    public static void main(String arg[]){
        int sum=0;
        Scanner s =new Scanner(System.in);
        int a[] =new int[5];
        System.out.println("enter the value of n");
        int n=s.nextInt();
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("the values of n : " +n);
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
        int avg=sum/n;
        System.out.println(avg);
    }
}
