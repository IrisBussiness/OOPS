package com.iris.inheritance;

class A{

    int a=10;
    void getA(){
        System.out.println("A method");
    }
}
class B extends A{
 int b=14;
}
class C extends  A{
    int c=35;
}
class D extends A{
    int d=90;
}

public class TestHierarchial {

    public static void main(String args[]){
        B bObj=new B();
        bObj.getA();
        D dObj=new D();
        dObj.getA();
    }
}
