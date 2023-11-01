package com.iris.inheritance;

class Food{
    String dishName="rice";
    void getTypeOfFood(String name){
        System.out.println("This is the type:"+name);
    }
}
class Veg extends Food{

    String vegDishName="Dal";

}
class NonVeg extends Food{
    String nonVegDishName="Chicken";
}

public class TestHierarchial2 {
    public static void main(String args[]){

        Food f=new Food();
        Veg v=new Veg();
        v.getTypeOfFood(v.vegDishName);
        NonVeg nv=new NonVeg();
        nv.getTypeOfFood(nv.nonVegDishName);
    }

}
