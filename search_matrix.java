package com.company;

import java.util.Scanner;

public class search_matrix {
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
        int temp=0;
        int target=s.nextInt();
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(a[i][j]==target){
                    System.out.println("the the element is present at position (" + i +", " + j+")");
                    temp=1;
                }
            }
        }
        if(temp==0){
            System.out.println("not found");
        }
    }
}
