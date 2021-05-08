package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount =5000.55;
        if (salesAmount <= 10000) {

            System.out.println("Good job, you qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Good job, you qualified for full bonus");
            bonus = 100.0;//

        }
        System.out.println("your total bonus : $" + bonus);


    }

}
