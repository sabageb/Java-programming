package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        /**          012345       */
        String word ="github project ";//012345

        System.out.println(word.indexOf("g"));//0
        System.out.println(word.indexOf("u"));//4
        System.out.println(word.indexOf("hub"));//3
        System.out.println("java");// -1 // -1 means it can not find
        System.out.println("t");// 2


    }
}
