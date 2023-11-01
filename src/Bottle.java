public class Bottle {

    //data fields
    //declaration
    String bottleColor;
    double bottleCapacity;

    Bottle()
    {
        //initialization
         bottleColor="red";
         bottleCapacity=1.5;
        System.out.println("Constructor is called");
    }

    public static void main(String args[]){

        //creating the object
        Bottle bottleObj=new Bottle();
        System.out.println(bottleObj.bottleCapacity);



    }

}
