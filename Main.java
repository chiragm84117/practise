package com.company;
import java.util.*;
public class Main {
//main file
    public static void main(String[] args) {
	// write your code here
        int num;
        System.out.println("enter a no");
        Scanner s = new Scanner(System.in);
        num=s.nextInt();
        if((num%2)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
