package day24_loops;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        //print alphabet a to z using while loop

       Scanner scan = new Scanner(System.in);

        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
       // char letter = 'f';
        //System.out.println("letter = " + letter);
        //letter++;
        //System.out.println("letter = " + letter);



        while (start <= end) {
            System.out.print(start + " ");
            start++;


        }

        /*   while (start >= end) {
            System.out.print(start + " ");
            start--;


        }*/

        //print alphabet reverse order
        //     letter ='z';
        //    while(letter >= 'a'){
        //         System.out.print(letter+" ");
        //         letter--;
        //     }
    }
}