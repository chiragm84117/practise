package com.company;
import java.util.*;


public class static_sample1 {
    static int b=900;
    static {
        //static class will get the higher preference that main method
        int a=100;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(b);
    }
}
