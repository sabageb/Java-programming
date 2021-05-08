package day15_Logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {

boolean onSale = true;
boolean freeShipping = true;
String itemName = "Wooden Spoon";

if (onSale && freeShipping) {
    System.out.println("Adding to cart - " + itemName);
} else {
    System.out.println("Continue shopping for good deals on - " + itemName);


}
// add to cart only when it is freeshipping , onSale and itemName is " Wooden Spoon"
        if (freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Add to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);


        }

        // add to cart when it is freeshipping , onsale and item is "Wooden Spoon"
if(freeShipping && onSale && itemName.equals("Wooden Spoon")) {
    System.out.println("Add to cart - " + itemName);
} else {
    System.out.println("Continue shopping for good deals on - " + itemName);
}




    }
}
