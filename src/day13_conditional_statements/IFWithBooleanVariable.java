package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;


        if (isHungry == true) {

        }
        if (isHungry) {
            System.out.println("I am hungry, i will go to get something to eat!");
            System.out.println("Then code java!");
        } else {
            System.out.println("I am not hungry, i will keep coding java!");
            double price = 130.44;
            boolean isAffordable = price <= 200;//200 is budget
            if (isAffordable) {
                System.out.println("IsAffordable = " + isAffordable);
                System.out.println("I can afford it, lets buy!");
            } else {
                System.out.println("Too expensive , it lets keep coding java");

            }
            boolean isRomotejob = true;
            //if it not remotejob print "Sorry i am not intersted"
            // otherwise, print, "sure i am intersted, what is the interview process?"
            // if (isRemoteJob!= true)
            //if (isRemoteJob==false)
            //if (!isRemoteJob == false) {
                System.out.println("Sorry , i am not interested");
          //  } else {
                System.out.println("Sure , i am intersted , what is interview process");
            }
        }

    }


