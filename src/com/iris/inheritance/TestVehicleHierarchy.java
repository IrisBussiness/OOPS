package com.iris.inheritance;

class Vehicle
{
    String make="axssas";
    String model="sdjbs";
    int year=2324;

    void displayInfo(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);

    }
}
class Car extends Vehicle
{
    int numDoors;

    void startEngine(){
        System.out.println("Car's engine started");
    }
}
class MotorCycle extends Vehicle{
    boolean isSportBike;

    void wheelie(){
        System.out.println("Motorcycle performing wheelie");
    }
}

public class TestVehicleHierarchy
{
    public static void main(String args[]){

        Car c=new Car();
        c.displayInfo();
        c.startEngine();

        MotorCycle mc=new MotorCycle();
        mc.displayInfo();
        mc.wheelie();

    }
}
