package day36_methods_with_return;
/**
 * dd new package day36_methods_with_return
 * add new class CreditScore
 * method name:
 *     checkEligible
 * input/parameter:
 *     int creditScore
 * if creditScore is 700 or more
 *     you are eligible for leasing this car
 * otherwise
 *     Sorry, you are not eligible for leasing this car
 */
public class CreditScore {
    public static void main(String[] args) {
        checkEligible(815);
        checkEligible(760);
        checkEligible(400);
        //System.out.println(checkEligible(711) );// ERROR- CAN NOT PRINT VOID METHOD
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);

    }
        public static void checkEligible(int creditScore) {
        if(creditScore >= 700) {
            System.out.println("You are Eligible for leasing this car");
        }else{
            System.out.println("sorry you are not eligible for leasing this car");
        }

        }

   public static int getCreditScore(){
        return 800;


   }


    }

