package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main (String[] args){

        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52/12;// weeklyPay * 4; <might not be
        double annualPay = monthlyPay * 12;


        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("Monthly pay : " + monthlyPay);
        System.out.println("Annual pay " + annualPay);
    }
}
