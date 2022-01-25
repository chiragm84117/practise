package com.company;
import java.util.*;

class book{
    int bookid;
    String bookname;
    int price;
}

public class book_price_max {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("enter the no. of book");
        n=s.nextInt();
        book a[]=new book[3];
        for(int i=0;i<n;i++){
            System.out.println("enter the bookid ,book name ,price of the book");
            a[i]=new book();
            int id=s.nextInt();
            String name=s.next();
            int price=s.nextInt();
            a[i].bookid=id;
            a[i].bookname=name;
            a[i].price=price;
        }
        int max=a[0].price;
        for(int i=0;i<n;i++){
            if((a[i].price)>(max)){
                max=a[i].price;

            }
        }
        for(int i=0;i<n;i++){
            if(a[i].price==max){
                System.out.println("book named " + a[i].bookname + " with id "+ a[i].bookid +" has max price of " + a[i].price  );
            }
        }

    }
    }


