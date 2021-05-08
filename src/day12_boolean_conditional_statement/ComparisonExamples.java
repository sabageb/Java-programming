package day12_boolean_conditional_statement;

public class ComparisonExamples {
    public static void main(String[] args) {
       // declare 3 variables,
       // currentSpeed = 45;
        //speedLimit = 55;
       // isSpeeding -> true if speeding, false if not speeding
        // "are you speeding? - " true/false

        int speedlimit = 55;
        int currentSpeed  = 45;
        System.out.println(currentSpeed > speedlimit);//false
        int speedLimit=55;
        System.out.println(speedLimit<currentSpeed); // false
        System.out.println(speedLimit==currentSpeed);//false 55 not equal to 45

       boolean isSpeeding = currentSpeed > speedlimit;
      System.out.println(" Are you speeding? " + isSpeeding + " mph");

        System.out.println("speedLimit = " + speedLimit + "mph");

        //45 + 20 ->64
currentSpeed +=20;
isSpeeding= currentSpeed>speedlimit;

        System.out.println(" Are you speeding? - " + isSpeeding + " mph");
        System.out.println("currentSpeed = "+ currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");


        double accountBalance = 250.25;
        double itemPrice = 300.00;
        System.out.println(accountBalance>=itemPrice);//true
        System.out.println("can i afford? - " + (accountBalance>=itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford= " + canAfford);

        //decreasePrice by itemPrice. using shorthand operator __
        //accountBalance = accountBalannce -itemPrice
        accountBalance-=itemPrice;

       boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? -" + isBroke);




    }

}
