package com.company;

import java.io.*;

public class check_file {
    public static void main(String[] args) {
        File f=new File("java.iml");
        boolean r = f.isFile();
        if(r){
            System.out.println("yes it is");
        }
        else{
            System.out.println("no");
        }
    }
}
