package com.company;
import java.util.*;
public class sort_no_assending {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter 5 no");
        int temp=0;
        int n[]=new int[5];
        for(int i=0;i<5;i++){
            n[i]=s.nextInt();
        }
        s.close();
        int max=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(n[i] > n[j]){
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        System.out.println("array sorted");
        for(int i=0;i<4;i++){
            System.out.print(n[i] + ", ");
        }
        System.out.print(n[4]);
    }
}
