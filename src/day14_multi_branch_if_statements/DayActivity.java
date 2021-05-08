package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
//String weather = "sunny";
//,"rainy","snowy", "windy";
// when sunny go to park // when rainy -stay home drink tea// when snowy clean the car then build snowman
        //when windy -get ready for power loss fly kite, and code java //anything else just keep coding java
        String weather = "sunny";

        if (weather.equals("sunny")) {
            System.out.println(weather + "Go to park , hiking, and code java");

        } else if (weather.equals("rainy")) {
            System.out.println(weather + "stay home, drink tea, and code java");

        } else if (weather.equals("snowy")) {
            System.out.println("weather + clean the car then build the snowman,drink hot chocklat");


        } else if (weather.equals("windy")) {
            System.out.println("weather + -get ready for powerloss ");
        } else {
            System.out.println("keep coding java");


        }
    }
}