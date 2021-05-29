package day44_custom_classes;

public class AnimalObjects {
    // instance variable:
    // type=> "some animal"
    //methods: non static - eat , speak

    // create Animal class object and use type, and method
    //INSTATIATE Animal class:

    public static void main(String[] args) {
        // our object will use from Animal class
             //this animal is  our variable
        Animal animal = new Animal();
        System.out.println(animal.type);// here it shows some animal
        animal.eat("grass");
        animal.speak();

        // create object -  cheetahObj

        Animal cheetahObj = new Animal();

        cheetahObj.type = "cheetah";// change value to "cheetah/ this will reassign to cheetah
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");

    }


}
