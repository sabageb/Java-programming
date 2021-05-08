package day40_arraylist;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {

List<Integer> nums = new ArrayList<>();// poliymorphic way of declaring
        System.out.println(nums);
        System.out.println("size " + nums.size());

nums.add(34); nums.add(44); nums.add(3); nums.add(88);
nums.add(500); nums.add(5); nums.add(845); nums.add(0);
nums.add(500); nums.add(5); nums.add(845); nums.add(0);

        System.out.println("nums = " + nums);

        nums.remove(0);// remove element -zero index which is 34

        System.out.println("nums = " + nums);
        // nums.remove (88); -> index 88-> IndexOutOfBoundsException

        nums.remove(new Integer(88)); //removes number 88  , not 88th index
        nums.remove(new Integer(5));// will remove only the 1st 5 and will not remove other 5 if u have more than one nr 5
        System.out.println("nums = " + nums);

        // for loop: iterate through all values and print
        for (int i = 0; i <nums.size(); i++){
            System.out.println(nums.get(i));

        }
   //   for each loop , and print all in same line for ech loop takes care of the (get)
        for(int each : nums){
            System.out.print(each +" ");
        }
    }
}
