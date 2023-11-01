package com.iris.inheritance;

public class Programmer extends Employee
{
    String pgrName="dev";

    public static void main(String args[]){

        Programmer pg=new Programmer();

        System.out.println(pg.getPackage());
    }
}
