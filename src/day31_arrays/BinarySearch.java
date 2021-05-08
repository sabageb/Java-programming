package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

   int [] nums = {-5, 23, 123, 654,3548, 2344, 12345, 14421, 1};
        System.out.println(Arrays.binarySearch(nums, 23));//0
        System.out.println(Arrays.binarySearch(nums, 2344));//3
        System.out.println(Arrays.binarySearch(nums, 25));//-2
        System.out.println(Arrays.binarySearch(nums, 700));//-4
        System.out.println(Arrays.binarySearch(nums, -5));//0

//check if number 12345 is among numbers in Array
        if(Arrays.binarySearch(nums,12345 ) >=0) {
            System.out.println("12345 is present in array");
        }else{
            System.out.println("12345 is not present in array");

        }
    }
}
