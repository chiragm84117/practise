package com.company;

import java.util.Scanner;

public class tranpose_of_the_martix {
    public static void main(String[] args) {
        int row=3, col=2;
        int a[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("after tranpose");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();

        }
    }

    }


