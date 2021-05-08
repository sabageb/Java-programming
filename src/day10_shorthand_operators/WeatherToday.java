package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");

        String weather = "sunny";
        System.out.println("weather = " + weather);


        //String weather;
        weather = scan.nextLine();

        //String weather = scan.next();
        //String weather = scan.nextLine();
        System.out.println(weather + " - is a nice day today !");

        //String weather = scan.nextLine();

        System.out.println("weather = " + weather);
        System.out.println(weather + "- is a nicee day today!");



      //weather- sunny, raining, very cold, very hot
      //creat scanner object
        //ask question:
       // How is the weather today?
                //"cold"
        //cold - is a nice day today!




        //System.out.println();



    }
}
