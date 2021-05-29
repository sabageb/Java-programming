package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";//in string pool
        String word2 = "java"; //re-use from string pool
        String word3 = new String("java"); // Create  NEW object in  HEAP, outside String pool
String word4 = new String("java");// Create  NEW object in  HEAP, outside String pool


        System.out.println(word1 == word2);// True - point to same object in pool
        System.out.println(word1 == word3);//False -  point to different object in HEAP AND POOL
        System.out.println(word3 == word4);// FALSE  -> POINT TO DIFFERENT OBJECTS IN HEAP

        System.out.println(word1.equals(word2));//TRUE - comparing values
        System.out.println(word1.equals(word3));// TRUE - comparing values
        System.out.println(word3.equals(word4));//TRUE - comparing values


    }

}
