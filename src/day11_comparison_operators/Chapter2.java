package day11_comparison_operators;

public class Chapter2 {
    public static void main(String[] args) {


        int apples = 0;
        System.out.println(apples);//0
        System.out.println(++apples);//1
        System.out.println(apples);//1
        System.out.println(apples++);//2
        System.out.println(apples);//2

        apples--;
        System.out.println(apples);
        System.out.println(--apples);

        int pears = 3;
        //       3 + 1=4    * 5/4 pears  (3 current pears value bcz --)  +  2
        int basket = ++pears * 5 / pears-- + --pears;
        System.out.println( basket);
        System.out.println(pears);

        //int counter =10;
        //counter = counter + 1;
        //counter ++; // shorterway
    }
}
