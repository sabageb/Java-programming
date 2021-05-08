package day42_arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " +letters.size());
        System.out.println(letters);
        // reverse - it will write java is fun in reverse
        Collections.reverse(letters);

        System.out.println("reversed = " + letters);


        // how many letters in arraylist arraylist java is fun
        Collections.frequency(letters, 'a');
        System.out.println(Collections.frequency(letters, 'a'));

        int vCount =Collections.frequency(letters,'v');

        System.out.println("vCount = " + vCount);

        System.out.println("Max char = "+ Collections.max(letters));
        System.out.println("min char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'a', 'u');// REPLACE RETURNS BOOLEAN
        // replace i with j  in the letters
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23,1, 43, 5, 5, 5, 5, 234, 7, -9,0);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("After reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);


        System.out.println("max = " + max);
        System.out.println("min = " + min);


int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);

        int countOf1s = Collections.frequency(nums, 1);
        System.out.println("countOf1s = " + countOf1s);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("After replaceAll = "+ nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums) ;

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);




    }

}
