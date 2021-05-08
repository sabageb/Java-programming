package day09_scanner_practice;

import java.util.Scanner;
public class AskAgeV2 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How old are you?");
    // scan.nextInt();

    int age = scan.nextInt();
    System.out.println(age + " - that`s great age!");
    //scan.close();// if you want to close scanner. it will clear the memory.
}
}
