package day14_multi_branch_if_statements;
// when operator: + : add num1
//  when operator: - : minus num1, num2
//when operator : * : multiply num1, num2
//  when operator: / : divide num1, num2
// any other: invalide operator

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// create scanner object
        System.out.println("Enter 2 numbers:");// print "enter 2 numbers"
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("enter operator : -, + ,*,/ ");
        char operator =scan.next().charAt(0);


        //char operator = '-';
      //  double num1 =5.5;
        //double num2 = 2.5;
       // char operator = '-';
        if( operator == '+') {
            System.out.println(num1 + num2);
        }else if (operator == '-') {
            System.out.println(num1 - num2);
        }else if( operator == '*') {
            System.out.println(num1 * num2);
        } else if ( operator == '/' ) {
            System.out.println(num1 / num2);
        }else {
            System.out.println(" Invalid operator");


        }
    }
}
