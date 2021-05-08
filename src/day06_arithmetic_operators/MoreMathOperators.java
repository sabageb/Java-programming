package day06_arithmetic_operators;

public class MoreMathOperators  {
    public static void main(String[] args) {

        int toyotas = 431;
        int hondaS = 233;
        int vws = 2;
        int tesla = 20;
        int nissan = 1;
        int bmws = 155;

        int totalCarsInParking = toyotas + hondaS + vws + tesla + nissan + bmws;
        System.out.println("There are " + totalCarsInParking + "cars in parking lot");
        //OUTPUT: There are 842 cars in parking lot

        System.out.println("There are " + totalCarsInParking + " cars in parking lot");


// there are 2 slices per person
//System.out.println("there are " + slicesPerPerson+ "slices per person");

// we ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
String pizza= "hawaiin";
int slices = 8;
int people = 4;
int slicesPerPerson = slices/people;
        System.out.println("We ordered hawaiian pizza with  "+slices+" slices, "+people+" people ate each " + slicesPerPerson + " slice of pizza ");

    }
}

