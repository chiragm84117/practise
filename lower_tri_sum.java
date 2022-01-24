package com.company;

import java.util.*;


public class lower_tri_sum {
    static void sum(int a[][]){
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j) {
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println("sum : " + sum);
    }
    public static void main(String[] args) {
        int row=3, col=3;
        int a[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        sum(a);
    }
}
