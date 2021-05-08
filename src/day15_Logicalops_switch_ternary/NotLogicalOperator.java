package day15_Logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        // ! is not equal comparison operator.
        System.out.println("!true = " +(!true));
        System.out.println("!false = " + ( !false));

        int age = 20;
        //check if age is not more than 7. print  "need to sit in child car seat.
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);

        } else {
            System.out.println("Can sit normal seat. age = " + age);
        }

  boolean isSmokingAllowed = true;
        // if smoking is not allowed; print "Smoking is now allowed here. Exit."
        if(!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");


        } else {
            System.out.println("this area is for smoking");
        }


        boolean isAffordable = false;
        // if it`s not affordable then print "item Not affordable"
        if(!isAffordable) {

            System.out.println("Item Not affordable");
        }
   String env =  "qa";
        if(env.equals("qa")){
            System.out.println("In wrong environment for QA testing");

        }
   String carModel = "Test";
        // if its not Tesla,print "Not interested"
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested, thank you ");
        }




        String secretPassword = "abc123";
        String inputPassword = "abc321";


        if(inputPassword.equals("abc123")){
            System.out.println("correct password");
        }else {
            System.out.println("In correct password");

        // OR

        if (secretPassword.equals("abc123")){
            System.out.println("correct password");
        }else {
            System.out.println("In correct password");
        }

        }
            //if inputPassword is not equals inputPassword: print " Incorrect Password"
        if(!inputPassword.equals("abC123")){
            System.out.println("Incorrect password");

            if(!inputPassword.equals(secretPassword)){
                System.out.println("incorrect password");


            }

        }


    }



    }

