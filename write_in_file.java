package com.company;
import java.io.*;
public class write_in_file {
    public static void main(String[] args) {
        File f=new File("one.txt");
        try{

            FileWriter fw =new FileWriter(f);
            fw.write("First file program to write something on it");
            fw.close();
            System.out.println("done");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}


