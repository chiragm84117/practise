package com.company;

import java.io.*;

public class simplewrite {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("one.txt");

            String s = "this thr Fileoutput program";
            byte b[] = s.getBytes();
            f.write(b, 0, 10);

        } catch (Exception e) {
            System.out.print(e);

        }
    }
}

// output stream are filewriter ,file output stream,bufferd writer,dataoutputstraeam,object
