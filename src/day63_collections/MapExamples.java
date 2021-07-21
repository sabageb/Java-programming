package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {

        //id, names // value can be duplicate but VALUE HAS TO BE UNIQUE
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Daria");
        System.out.println(map);
        map.put(100, "Maxim");
        map.put(101, "Maxim");
        System.out.println(map);
        System.out.println(map.get(100));
        System.out.println(map.get(50));

        System.out.println(map.remove(1));
        System.out.println(map);
        map.put(1, "Kinga");
        System.out.println(map);
        map.remove("Maxim");//WE CAN NOT REMOVE BY VALUE , WE CAN ONLY REMOVE BY KEY
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Anna"));

        for( Integer Key :map.keySet() ){
            System.out.println(Key + " - " + map.get(Key));


            if(map.get(Key).equals("Daria")){
                System.out.println("This is our key" + Key);
            }
        }


    }
}
