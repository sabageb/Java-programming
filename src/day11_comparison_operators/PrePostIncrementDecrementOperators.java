package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {

     //  int num1 = 1;
       //num1++;
       //++num1;

     //System.out.println(num1);//3

       // int num2= 5;
        //num2--;
        //--num2;
        //System.out.println(num2);

        //pre increment
        //int num1= 10;
        //int num2= ++num1;
        //System.out.println(num1);
        int kiwi = 15;
        int kiwiBasket = kiwi++;

        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);

        int a= 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
