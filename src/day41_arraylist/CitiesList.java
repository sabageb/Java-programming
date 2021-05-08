
package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {

    public static void main(String[] args) {
        // declare arraylist. alt/ option +enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add method
        cities.add("Washington DC");//0
        cities.add("New York");//1
        cities.add("Vienna");//2
        cities.add("Adana");//3
        cities.add("LA");//4
        // add Ashgabat to index 0
        cities.add(0,"Ashgabat");
        // print all values in same line
        System.out.println(cities);
        // print first and last city
        System.out.println("first city ="  +cities.get(0));
        System.out.println("last city = "+cities.get(5));
        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));

// print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        //System.out.println("size = "+size);
        System.out.println("there are "+ size+"cities in the list");


        //for loop and print all value in same line
        for(int  i= 0; i < cities.size()/2; i++){// to see half of the city list
            System.out.print(cities.get(i)+" ");//"" gives space between the city
        }
        System.out.println();



        // for each loop
        for(String city : cities){
            System.out.print(city+ " ");
        }
//delete or remove item from arraylist
 //1) remove using index: remove value at index 3
 cities.remove(3);

 //2) remove using  object/value
 cities.remove("New York");// if u have 2 new york in your list will remove the first one
 System.out.println("after remove = "+ cities);

 //DELETE /REMOVE ALL VALUES FROM LIST
 cities.clear();

 // make sure it is clear
 //1) print | spit it out
 System.out.println("cities = " +cities);

 //2) using isEmpty
 if (cities.isEmpty()){

 System.out.println("list is empty");

 }


 //3) check size() == 0
 if (cities.size() == 0){

 System.out.println("list is empty");
    }
}
}
