package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

class books{
    int bookid=1002;
    String booktitle="java",category="cse";
    float price=750;
    void display(){
        System.out.println(bookid + "\t"+ booktitle + "\t" + price);
    }
}

class cse extends books{
    String booktitle="python";
    int price = 983;

    void display(){
        super.display();
        //method overriding
        //with this we can also display the parent class display method
        System.out.println(booktitle + "\t" + price);
    }
}

public class inhertiance_book {
    public static void main(String[] args) {
        cse cs=new cse();
        cs.display();
    }
}
