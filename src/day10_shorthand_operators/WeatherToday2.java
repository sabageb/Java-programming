package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday2 {

    public static void main(String [] args) {

       Scanner scan  = new Scanner(System.in);
       System.out.println("how is the weather today?");
        String weather = scan.next();//scan next has to be small s
        System.out.println(weather + " - is a nice day today!");



    }
}
