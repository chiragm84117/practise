package com.company;
// not working well;
import java.util.*;
import java.util.Scanner;
import java.util.Scanner;
public class da1_java {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. no. of years");
        int n=s.nextInt();
        System.out.println("Enter the no. no. of states");
        int m=s.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int max = arr[1][1];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        if (j == 0) {
                            System.out.print("Tamilnadu has highest rainfall in 2015");
                        }
                        if (j == 1) {
                            System.out.print("Andhra Pradesh has highest rainfall in 2015");
                        }
                        if (j == 2) {
                            System.out.print("Kerala has highest rainfall in 2015");
                        }
                    }
                } else if (i == 1) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        if (j == 0) {
                            System.out.print("Tamilnadu has highest rainfall in 2016");
                        }
                        if (j == 1) {
                            System.out.print("Andhra Pradesh has highest rainfall in 2016");
                        }
                        if (j == 2) {
                            System.out.print("Kerala has highest rainfall in 2016");
                        }
                    }
                } else if (i == 2) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        if (j == 0) {
                            System.out.print("Tamilnadu has highest rainfall in 2017");
                        }
                        if (j == 1) {
                            System.out.print("Andhra Pradesh has highest rainfall in 2017");
                        }
                        if (j == 2) {
                            System.out.print("Kerala has highest rainfall in 2017");
                        }
                    }
                } else if (i == 3) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        if (j == 0) {
                            System.out.print("Tamilnadu has highest rainfall in 2018");
                        }
                        if (j == 1) {
                            System.out.print("Andhra Pradesh has highest rainfall in 2018");
                        }
                        if (j == 2) {
                            System.out.print("Kerala has highest rainfall in 2018");
                        }
                    }
                } else if (i == 4) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        if (j == 0) {
                            System.out.print("Tamilnadu has highest rainfall in 2019");
                        }
                        if (j == 1) {
                            System.out.print("Andhra Pradesh has highest rainfall in 2019");
                        }
                        if (j == 2) {
                            System.out.print("Kerala has highest rainfall in 2019");
                        }
                    }
                }
            }
            System.out.println();
        }

    }
}