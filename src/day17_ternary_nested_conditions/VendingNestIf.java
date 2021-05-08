package day17_ternary_nested_conditions;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class VendingNestIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea item is selected");
            } else {
                System.out.println("coke item is selected");
            }

        } else if (selection.equals("snack")) {
            System.out.println("snack option is selected");

        } else if (selection.equals("chips")) {
            System.out.println("chips option is selected");
        } else {
            System.out.println("candy option is selected");

        }

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("coke")) {
                System.out.println("coke item is selected");
            }
int  number = 10;
            if (--number > 10) {
                System.out.println("hello cybertek" + number);
            } else if (number ==9){
                System.out.println("hello world " + number);
            }
boolean result= true;
            if(result) {
                System.out.println("B");

            } else if (result ) {
                System.out.println("C");
            }

        } else  {
            System.out.println("A");


            }
    int x  = 10;
        int y = x++;
        System.out.println(++y);
     //System.out.println(y++ + " " + x++ + " " + y);

    }
    }





