package day17_ternary_nested_conditions;

public class AmazonPrimeNestedIf {
    public static void main(String[] args) {
        double price = 195.0;
        // int itemPrice = 30;
        boolean isPrimeMember = false;
        // when isPrimeMember is true
        // print "Eligible for free 2 day shipping"
        //  otherwise when itemPrice is more than 25
        // print "Not eligible for free shipping. fee is & 10"

        if (isPrimeMember) {
            System.out.println("Free 2 day shipping eligible");
        } else {
            if (price >= 25.0) {
                System.out.println("eligible for free shipping");

            } else {
                System.out.println("Not eligible for free shipping. fees = $10");
            }
        }


    }
}
