package day40_arraylist;
import java.util.*;
public class RawArrayList {
    public static void main(String[] args) {
        //declare RAW arraylist: ArrayList nums = new ArrayList(); Raw ArrayList is not recommended
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        //add values
        list1.add("java");
        list1.add("apple");
        list1.add("coffee");
        list1.add("1234");
        list1.add("55.2");
        list1.add("true");
        list1.add("wooden spoon");
        System.out.println(list1);
        System.out.println("size = " + list1.size());




    }


}
