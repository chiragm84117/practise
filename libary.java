package com.company;
//copy contructor
import java.util.*;

class libdec{
    int libno;
    String bookname;
    float price;

    libdec(){
        libno=04;
        bookname="chirag";
        price=900;
    }

    libdec(libdec l){
        libno=l.libno;
        bookname=l.bookname;
        price=l.price;
    }

}
public class libary {
    public static void main(String[] arg){
        libdec l = new libdec();
        System.out.println(l.libno+ " "+l.bookname+" "+l.price+" ");
        libdec l1 =new libdec(l);
        System.out.println(l1.libno +  " "+l1.bookname+" "+l1.price+" ");
    }
}
