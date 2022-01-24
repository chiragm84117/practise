package com.company;

public class overloading_method {
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    double add(double num1, double num2)
    {
        return num1+num2;
    }
    public static void main(String[] args){
        overloading_method obj = new overloading_method();
        int a = obj.add(10, 15);
        System.out.println("Sum :"+a);
        double b=obj.add(10.5,11.6);
        System.out.println("sum of double: "+b);
    }
}
