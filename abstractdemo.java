package com.company;
import java.util.*;

abstract class emplye {
    void location() {
        System.out.println("hello");
    }
    abstract void display();
    void show(){
        System.out.println("parent");
    }
}
//create to use abstract class method
//otherwise we cannot use abstract class method

// if u create the abstract method adn inheritance  the is mandatory to have method body in the child class
class child extends emplye{
    void display(){
        System.out.println("good morning");
    }
    void show(){
        super.show();//overriding
        System.out.println("child");
    }
}

public class abstractdemo {
    public static void main(String[] args) {
        child e= new child();
        e.location();
        e.display();
        e.show();
    }
}
