package com.company;

import java.util.*;


public class reservation {
    public static void main(String[] arg) {
        railway r1 = new railway();
        r1.input();


    }
}
class railway {
    int no;
    String date, source, destination,bt;
    double kms;
    Scanner s = new Scanner(System.in);

    void input() {
        no = s.nextInt();
        date = s.next();
        source = s.next();
        destination = s.next();
        //kms = s.nextFloat();
        bt = s.next();
        if(bt=="bus") {
            bus(no);
        }
        else {
            train(no);
        }
    }

    void bus(int no) {
        float distance = s.nextFloat();
        float fare = distance * 1.00f * no;
        System.out.println(fare);
    }

    void train(int no) {
        float distance = s.nextFloat();
        float fare = distance * 1.50f * no;
        System.out.println(fare);
    }
}