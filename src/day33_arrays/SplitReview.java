package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        //dont use this method if ends with a . and starts with a (add one more).
        String word = "java";
        String[] array = word.split("a");

        System.out.println(array.length);//2
        int acountOfA = array.length;
        System.out.println("counOfA = " + acountOfA);
        if (word.endsWith("a")) {

            acountOfA++;
        }
        System.out.println("countOfA= " + acountOfA);
        System.out.println("----------SPLIT WITH EMPITY STRING--------");

        String[] strARR = word.split("");
        System.out.println(strARR[0]);
        System.out.println(strARR[1]);
        System.out.println(strARR[2]);
        System.out.println(strARR[3]);


        String word2 = "java1sql2hlm";
        String[] strArr2 = word2.split("\\d");
        // System.out.println(Arrays.toString(strArr2));
        //System.out.println("word2 = " + word2);
       // String password = "ABCD123_5";
        //if(password.matches)

        String password = "bcTd123_5";
        if (password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }


    }
}