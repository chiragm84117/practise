package com.company;

import java.util.Scanner;

public class max_sell {
    public static void main(String args[]){
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sales representative");
        int n = sc.nextInt();
        System.out.println("Enter the sales person 1 product details");
        for(int i=0; i<3; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the sales person 2 product details");
        for(int i=0; i<3; i++){
            b[i] = sc.nextInt();
        }
        float sum1,sum2;
        sum1 s = new sum1();
        sum2 sm = new sum2();
        sum1 = s.getSum(a);
        sum2 = sm.getSum(b);
        System.out.println("The sum of sales person 1 and 2 are: "+ sum1 +" "+ sum2);
        if(sum1>sum2){
            System.out.println("Sales 1 is more than sales 2.");
        }
        else{
            System.out.println("Sales 2 is more than sales 1.");
        }
    }
}
class sum1{
    float getSum(int a[]){
        int i;
        float sum=0;
        for(i=0; i<a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
class sum2{
    float getSum(int b[]){
        int i;
        float sum=0;
        for(i=0; i<b.length; i++) {
            sum = sum + b[i];
        }
        return sum;
    }
}