package day18_conditions_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num % 2);// 0 remainder
        System.out.println(num % 2 == 0);// if num =4 true if num is 5 false
        if (num % 2 ==0){
        System.out.println(num + " is even");
    }else {
            System.out.println(num + " is odd");


        }
    }
}


