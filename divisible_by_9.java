package com.company;
import java.util.*;
public class divisible_by_9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int digitSum = 0;

        if(num % 9 == 0){
            System.out.println("Given number is divisible by 9");
        } else {
            System.out.println("Given number is not divisible by 9");
        }
    }
}
