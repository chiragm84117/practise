package com.company;
import java.util.*;
public class unit_martix {
    public static void main(String[] args) {
        int row,col;
        int a[][]=new int [3][3];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
        boolean temp=true;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if(a[i][j]!=1 && i==j ){
                    temp=false;
                    break;
                }
                if(a[i][j]!=0 && i!=j){
                    temp=false;
                    break;
                }
            }
        }
        if (temp){
            System.out.println("yes");
        }
        else {
            System.out.println("noo");
        }
    }
}
