package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MethodWithListReturn {
    /**
     * getIntegerList
     * no param
     * return  List<Integer>
     *Loop from 0 - 1 000_000
     * and add to arraylist then return it
     */
    public static void main(String[] args) {
        //1 second  = 1_000_000_000nano second
        long start = System.nanoTime();
        //List<Integer> mlnList= new ArrayList<>()
        List<Integer> mlnNums= getIntegerList();// returns ready ArrayList object. No need new array
        long ends = System.nanoTime();
        double listSeconds = (ends - start) / 1_000_000_000.0;
        System.out.println("ArrayList time = " + (ends - start));
        System.out.println("ArrayList seconds  = " + listSeconds);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);

        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);// remove nums less than 90
        System.out.println("nums = " + nums);




       long st =System.nanoTime();
        int[] arr = getIntegerArray();
        long en =System.nanoTime();//get ending time
        double seconds =(en - st) /1_000_000_000.0;
        System.out.println("Array time  = " + (en - st));// print duration
        System.out.println("Array time seconds  = " + seconds);

        //   System.out.println(getIntegerList());
    }

   public static List<Integer> getIntegerList(){

   List<Integer> list  = new ArrayList<>();
   for(int i =0; i<=100_000; i++) {
       list.add(i);
   }
   return list;

    }

/**
 * getIntegerArray
 * no param
 * return int[]
 * loop from 0-1000_000
 * and  add to [] then return
 */
public static int[] getIntegerArray() {
    //declare  empty array with size  1_000_001
int[] nums = new int[1_000_001];
for(int i=0; i<=1_000_001; i ++) {
    nums[i] = i;
}

return nums;
}

/**
 * getDays
 * param: int size
 * return nums
 */


public static List<Integer> getRandomList(int size) {

    Random random = new Random();//new random object with 0-100 limit
    List<Integer> nums = new ArrayList<>();
    for (int i = 1; i <= size; i++) {
        nums.add(random.nextInt(101));// generate random number and add to list

    }

return nums;
}
}

