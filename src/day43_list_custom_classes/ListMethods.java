package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
       // getDays().get(0);
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = "+ getDays().get(0));

        // so u can do this way or the above which is longer
        List<String>dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");
// removeIf method - java 8 -> accept lamda - add easy to remove without loop
        dayNames.removeIf( day ->day.length() == 6 );
        System.out.println("dayNames after removeIf = " + dayNames);

    }
        public static List<String> getDays() {

            List<String> days = new ArrayList<>();
            days.add("monday");days.add("tuesday");days.add("Wednesday");days.add("thursday");
            days.add("Friday");days.add("Saturday");days.add("Sunday");

            return days;

        }
    /**
     * getRandomList
     * param: int size
     * return List<Integer>
     *     generate random numbers(0 - 100) the count of size, and assign to list and return
     * getRandomList(3)-->43, 12, 54
     * getRandomList(2) -> 1, 4
     */

    public static List<Integer> getRandomList(int size){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<=size; i++) {
            list.add(random.nextInt(101));//
        }

return list;
    }
    }
