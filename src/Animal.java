public class Animal {

    //data fields
    String animalSounds;
    String animalName;

   //parameterized constructor
    Animal(String sound,String name)
    {
        animalSounds=sound;
        animalName=name;

    }

    /*Animal()
    {
        System.out.println("default");
    }*/

    public static void main(String args[])
    {

        Animal dog=new Animal("bow-bow","bentley");

        Animal cat=new Animal("meow","oreo");

        System.out.println(dog.animalName);
        System.out.println(cat.animalSounds);

    }
}
