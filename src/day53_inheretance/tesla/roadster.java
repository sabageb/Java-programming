package day53_inheretance.tesla;

public class roadster extends ElectricCar {


    public roadster(String make, String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);//super has to be 1st line in constructor
        System.out.println("Welcome new Roadster!");
    }

    }
