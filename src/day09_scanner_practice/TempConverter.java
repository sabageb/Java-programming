package day09_scanner_practice;
import  java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);// creat
       Scanner input = new Scanner(System.in);

        System.out.println("##### Welcome ####");
        System.out.println("**** F TO C  CONVERTER PROGRAM  ****");

double fahrenheitValue = input.nextDouble();
double celsiusValue =  (fahrenheitValue - 32) *5/9;
System.out.println(fahrenheitValue+ "F is in C:"+celsiusValue);




    }
}
