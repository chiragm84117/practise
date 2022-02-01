package com.company;
import java.util.*;

class person
{
    int personid=1000;
    String personname="XXX";
}
class personnel extends person
{
    int age=45, mobile = 1234567890;
    String address="No.45, Gandhi street, Vellore";

}
class working extends person
{
    String location="Delhi", desg="Project Manager";
    double salary=24567.90;
}

public class heriarical_inhertiance {
    public static void main(String ar[])
    {
        personnel p =new personnel();
        working w = new working();
        System.out.println("person id "+ p.personid);
        //accessing the child attributes in main class
        System.out.println("mobile " +p.mobile);
        System.out.println("Person name"+ w.personname);

    }
}
