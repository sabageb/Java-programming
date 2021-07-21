package day63_collections;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {

        Set<Integer> set= new HashSet<>();
        //list -> ArrayList
//set does not print duplicate #, only print #Number once
        //set prints #
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(100);
        set.add(100);

        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        words.remove( "world");
        System.out.println(words);

      for (String word : words) {


          //convert your set to a list

          List<String> wordList = new ArrayList<>(words);
          wordList.add("world");
          System.out.println(wordList);

          //linkedHashSet
// all set  does not allow you to duplicate- duplicate values get ignored when printed
          Set<String> linkedHashSet = new LinkedHashSet<>();
          linkedHashSet.add("24");
          linkedHashSet.add("java");
          linkedHashSet.add("$#");
          linkedHashSet.add("53");
          linkedHashSet.add("cucumber");
          System.out.println(linkedHashSet);
          //linkedHashSet.get();


//lexiographical
          Set<String> treeSet = new TreeSet<>();
          linkedHashSet.add("24");
          linkedHashSet.add("java");
          linkedHashSet.add("$#");
          linkedHashSet.add("53");
          linkedHashSet.add("Cucumber");
          linkedHashSet.add("apple");
          linkedHashSet.add("jeva");
          System.out.println(treeSet);
          ((TreeSet)treeSet).first();
      }


    }
}
