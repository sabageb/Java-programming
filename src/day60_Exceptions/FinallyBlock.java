package day60_Exceptions;
import java.util.*;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {


        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = scan.nextInt();
            System.out.println("you entered " + num);
            System.exit(0);// stop java altogether, finally
        } catch (InputMismatchException e) {
            System.out.println("you entered Invalid value ");
        } finally {
           // scan.close();//close and clean up the scanner
            System.out.println("Finally block - runs always");

        }
    }
}