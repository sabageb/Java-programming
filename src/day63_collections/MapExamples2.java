package day63_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples2 {
    public static void main(String[] args) {

        //id, Person; person =value ; Integer = key

        Map<Integer, Person> map = new HashMap<>();
        map.put(32, new Person("MJ", 32));
        map.put(null, new Person("", 0 ));
        map.put(12, new Person("Nick", 10));

        System.out.println(map.get(31));//will print null
        System.out.println(32);//Person {name ='MJ', age=32}
        System.out.println(map.get(null));// Person{name = '', age-0}
        System.out.println(map);

        System.out.println("*******************************************");

        Map<Integer, Person> map2 = new LinkedHashMap<>();
        map2.put(32, new Person("MJ", 32));
        map2.put(null, new Person("", 0 ));
        map2.put(12, new Person("Nick", 10));
        System.out.println(map2);

        System.out.println("****************************************");

        Map<Integer, Person> map3= new TreeMap<>();
        map3.put(32, new Person("MJ", 32));
        map3.put(0, new Person("", 0 ));
        map3.put(-12, new Person("Nick", 10));
        System.out.println(map3);


        //DATA BASE Example
        /*
          FIRST_NAME JAMES
          LAST_NAME BOND
          AGE  50

          FIRST_NAME  AMY
          LAST_NAME  ROSE
         AGE 30

         Map<String, String> map= new HashMap<>();
         map.put("FIRST_NAME, "JAMES"")
         MAP.PUT("LAST_NAME")

         map.get("FIRST_NAME")

         if(map.get("AGE") < 0) FAIL TEST CASE

         if(Map.get("FIRST_NAME ") == null) fail test case

         List< Map<String, String> > list

         list.get(0)--> Map<String, String> (James bond)
         list.get(0).get("FIRST_NAME")-->James
         */





    }
}
