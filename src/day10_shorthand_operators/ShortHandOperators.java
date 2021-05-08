package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("cars in parking lot = " +cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " +cars);

        cars += 5; // gives cars 10 + 5=
        //cars =+5;// gives 5

        System.out.println("cars in parking lot = " +cars);
//6 cars left the parking lot
//int cars = 10;
        cars = cars -6;
//cars -= 6;
        System.out.println("cars in parking lot = " +cars);


//cars = cars - 1;
//cars-=1;

        System.out.println("cars in parking lot = " +cars);

       // int electricCars = 13;
       // cars = cars + electricCars;
       // System.out.println("cars in parking lot = + cars");

        //int electricCars = 13;
        // cars = cars + electricCars;

  //cars +=electricCars;
        // System.out.println("cars in parking lot = + cars");
String word = "JAava";
        System.out.println(" word = "+ word);

word = word + "programming";
        System.out.println(" word = " + word);
        // add " is fun"

        word = " is fun";
        System.out.println(" word = " + word);


        String selenium =  " but  selenium is more fun.";

        word = word + " selenium is more fun.";
        word+= 12345;
        System.out.println(" word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter = 3;
        System.out.println(" letter = "+ letter );
        // add 'j' to letter
        letter += 'J';
        System.out.println("letter = " + letter);
//add 1 to letter

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " +parkingFee);
        // early bird fee is 50 off
//parkingFee = parkingFee /2;
parkingFee/=2;
        System.out.println("early bird parking fee =" + parkingFee);
        // weekend parking is fee
        parkingFee -= parkingFee;// parkingFee = parkingFee - parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);



    }
}
