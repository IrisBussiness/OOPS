package oops;

public class Fruit {

    //attributes

    String season;
    String color;
    int cost;

    //methods
    int getCostOfFruit(){
        return cost*12;
    }

    public static void main(String args[]){
        Fruit apple=new Fruit();

        apple.cost=25;
        //calling the function
        System.out.println(apple.getCostOfFruit());

    }

}
