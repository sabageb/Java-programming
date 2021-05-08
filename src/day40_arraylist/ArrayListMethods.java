package day40_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
      List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " +shoppingList.isEmpty());

        if(shoppingList.isEmpty()) {// checks if list is empty
            System.out.println("list is Empty, keep coding java");
        }else{
            System.out.println("list is not empty, code java then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        shoppingList.add("wooden spoon");


        if(shoppingList.isEmpty()) {
            System.out.println("list is Empty, keep coding java");
        }else{
            System.out.println("list is not empty, code java then go to mall");
        }


        int count = shoppingList.size();
        System.out.println("Items to buy = " +count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")) {// check if shoppinglist has shoes
            System.out.println("shoes is in the list");
        }else{
            System.out.println("shoes is not in the list");

        }
        System.out.println("Buying shoes ... $80");

        shoppingList.remove("shoes");// remove shoes from shoppinglist if present
        System.out.println("list = " + shoppingList);
        System.out.println("done shopping, get back to coding");
        shoppingList.clear();//clear the list, remove all items
        System.out.println(shoppingList);



    }
}
