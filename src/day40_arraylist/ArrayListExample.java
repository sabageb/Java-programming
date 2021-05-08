package day40_arraylist;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//                className
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);// index 0
        nums.add(7);//index 1
        nums.add(11);// index 2
        //nums.add("java");ERROR
        System.out.println("size = " + nums.size());

        //reading from arraylist
        System.out.println("index 0 = " +nums.get(0));
        System.out.println("index 1  = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
      // System.out.println(nums.get(3)); indexOutOfBoundsException

        //print all values in same line:
        System.out.println(nums);//Arrays.toString(numArray)
        nums.remove(1);//remove element at index 1- this will remove # 7- will only print [ 5, 11]

        System.out.println(nums);
    }

}
