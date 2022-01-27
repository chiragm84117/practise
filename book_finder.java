package com.company;

import java.util.*;
class bookfind{
    int noP,price;
    String bookN,publisher;

    bookfind(String _bookN,String _publisher,int _noP,int _price){
        bookN=_bookN;
        publisher=_publisher;
        noP=_noP;
        price=_price;
    }
}

public class book_finder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size,noP;
        String bookN,publisher,tobeSearched;
        int price;

        System.out.println("enter the no is book");
        size=s.nextInt();

        bookfind a[]=new bookfind[10];
        for(int i=0;i<size;i++){
            System.out.println("enter the book "+(i+1));
            System.out.println("name: ");
            bookN=s.next();
            System.out.println("Publisher:");
            publisher = s.next();
            System.out.println("No of pages:");
            noP = s.nextInt();
            System.out.println("Price:");
            price = s.nextInt();

            a[i]=new bookfind(bookN,publisher,noP,price);

        }
        System.out.println("\n enter the book to search");
        String tobe=s.next();

        for(int i=0;i<size;i++){

            if(((a[i].bookN).contains(tobe))==true){
                System.out.println("name: " + a[i].bookN +" and the price : " + a[i].price);
            }
        }
    }
}
