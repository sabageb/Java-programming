package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        //outer: 1 to 10
        //inner 1-10
        //print outer *inner +" "
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(outer * inner + "\t");

            }
            System.out.println();
        }

    }



}





