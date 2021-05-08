package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
       //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");

        // [jeep, lada, yugo,toyota, mazda, ford, moskvich, tesla]
        System.out.println(myCars);
        //or
        System.out.println(myCars.toString());// prints all cars
        String allCarsIn1St = myCars.toString();// saves all cars in one variable
        System.out.println("allCarsIn1St = " + allCarsIn1St);
        // change index 0 (which is jeep)to Lamborghini; jeep will be replaced by lamborghini

        myCars.set(0,"Lamborghini");

        System.out.println("after set = "+myCars.toString());

        // change index 4 to honda

        myCars.set(4, "honda");
        System.out.println("After set honda = "+myCars.toString());// to string is optional, still print same with or with out
        /**
         * How would you do that if myCars was array:
         * myCars[4]="Honda";
         */
        //find the index number of"ford" in the list
        //String STR ="JAVA";
        //str.indexOf("v")==>2

        System.out.println("index of ford = "+ myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        // change moskvich to jiguli
        myCars.set(moskvichIndex, "jiguli");
        System.out.println("after set to jiguli =" + myCars);

        // replace ford with Trabant using single statement: this is how we do it in ARRAYLIST
        // indexOf("ford"), "trabant"
        myCars.set(myCars.indexOf("Ford"), "trabant");
        System.out.println("after set to trabat = " +myCars);


        // change lada->bugatti
        // before changing lada to bugatti check 1st if lada is in the list
        // if statement checks for us if lada is in the list
        // if myCars contains "lada"
        //      find index of lada and set value to bugatti
        /*
        if myCars contains"lada"
        find index of lada and set value to bugatti
        else
        print "lada is not found"

         */
if(myCars.contains("lada")) {
                    //find the index 1st then change it to bugatti
    myCars.set(myCars.indexOf("lada"), "bugatti");
}else{
    System.out.println("lada is not found");

}
        System.out.println("after set bugatti = " +myCars.toString());

/**
 * change
 * lamborghini - to  -> prius
 * lada - to -> lexus
 * trabant - to -> audi
 */
for( int i=0; i< myCars.size(); i++){
    if(myCars.get(i).equals("lamborghini")) {

        //change to prius
        myCars.set(i, "prius");
    }else if(myCars.get(i).equals("toyota")) {
        myCars.set(i, "lexus");
    }else if (myCars.get(i).equals("trabant")){
        myCars.set(i, "audi");
    }
    }


    }

        }



