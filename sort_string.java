package com.company;
import java.util.*;
public class sort_string {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter 5 words");
        String temp=" ";
        String n[]=new String[5];
        for(int i=0;i<5;i++){
            n[i]=s.nextLine();
        }
        s.close();
        //int max=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                //this compareTo method will retuen +,-,0 value true,false,equal respectivly
                if(n[i].compareTo(n[j])>0){
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
