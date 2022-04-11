package com.company;
import java.io.*;
public class flie_make {
    public static void main(String[] args) {
        File f=new File("C:/code/java/");
        String filenames[]=f.list();
                for(String filename:filenames){
                    System.out.println(filename);
                }
    }
}
