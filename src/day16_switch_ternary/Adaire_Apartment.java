package day16_switch_ternary;

public class Adaire_Apartment {

    public static void main(String[] args) {

        System.out.println("## WELCOME TO ADAIRE APARTMENTS ####");

      int numberOfBedrooms = 1;
        double startingPrice = 0;

            switch(numberOfBedrooms){
                case 0:
                    System.out.println("Studio apartment selected");
                    startingPrice = 14454.0;
                    break;
                case 1:
                    System.out.println("one bedroom apartment selected");
                    startingPrice = 1725.0;
                    break;
                case 2 :
                    System.out.println("Two bedroom apartment selected");
                    startingPrice = 2899.0;
                    break;
                default:
                    System.out.println(numberOfBedrooms + " bedroom currently unavalable");
            }
        System.out.println("staring price: $" + startingPrice);
        }
    }












