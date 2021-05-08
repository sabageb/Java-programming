package day22_string_manipulation;
import java.lang.*;
public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word ="Anna";// to print ava - use print NOT println
        System.out.print(word.charAt(3));// print: a
        System.out.print(word.charAt(2));//print:n
        System.out.print(word.charAt(1));//n
        System.out.println(word.charAt(0));//a
        System.out.println(word);
//print using single statement and concat +


        System.out.println(""+word.charAt(3) + word.charAt(2) + word.charAt(1)
        + word.charAt(0));
        String noon = ""+word.charAt(3) + word.charAt(2) + word.charAt(1)
                + word.charAt(0);
        System.out.println("word = " +word );
        System.out.println("noon = " +noon);

        if(word.equalsIgnoreCase(noon)) {
            System.out.println("Palindrome word");
        }else {
            System.out.println("Not palindrome word");
        }

    }
}
