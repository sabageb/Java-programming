package day42_arraylist;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {

        // declalare Integer arraylist with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        // for each loop u put 2dots in the middle
        System.out.println(nums);
        // new array list to store only uniques numbers


        List<Integer> uniqueList = getUniqueIntegers(nums);
        // List<Integer> uniqueList = new ArrayList<>();
        System.out.println("\nuniqueList = " + uniqueList);
    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();
        //loop through the list
        for (int  num : nums){
            // check if number apears only ONCE in the list ==1
            if(Collections.frequency(nums, num) == 1) {
                // print that number
                System.out.println(num + " ");
                // if u find unique list then add to my list
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
}
