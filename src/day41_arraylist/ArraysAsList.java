package day41_arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        // when we have array list like this we can not add or removed from it. it is muted.
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        // nums.add(100);unsupportedOperationException
        //System.out.println("nums = " + nums);
        //nums.remove(0);// unsuperportedOperationException list
        // nums.clear();unsupportedOperationException
        //  List<Integer> nums = new ArrayList(Arrays.asList(23, 1, 34, 54));

        // List<Double> num2 = new ArrayList<>(Arrays.asList(23, 1, 34, 54, 654)) {
        // we can add or remove to this array list
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));// will remove nr 23 not index23
        System.out.println("numsList = " + numsList);

        /**
         List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke , pepsi, mdew,kambucha
         int caffienAmount = 0;
         String dring = "monster";
         monster, red bull, celsius
         caffeinAmount =150
         coffee, cambucha:
         caffeinAmount =112
         tea, coke, pepsi, mdew:
         caffeinAmount =35

         case sensetive-- if u want not to be case sensetive use IgnorCase
         */

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull",
                "coke", "pepsi", "mdew", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);

            } else if (drink.equals("coffee") || drink.equals("cumbucha")) {
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);


                System.out.println("**************************************************");
            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(drink + "--> " + caffeineAmount);
            }
        }

        for (String drink : drinksWithCaffeine){
            switch (drink){
                case "monster": case "red bull": case "celsius":
                    caffeineAmount =150;
                    System.out.println(drink+" -->" + caffeineAmount);
                    break;

                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount=35;
                    System.out.println(drink +"--> " +caffeineAmount);
                    break;

                case "coffee":
                case "cambucha":
                    caffeineAmount =112;
                    System.out.println(drink + "--> " +caffeineAmount);
                       break;


            }
        }


     drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));
        drinksWithCaffeine.forEach(each -> {
            System.out.println("----------");
            System.out.println("each = " + each);
            System.out.println("----------");
        } );

    }
}

