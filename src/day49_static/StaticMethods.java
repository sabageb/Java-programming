package day49_static;

import java.util.Enumeration;

public class StaticMethods {


    int num = 10;
    static int count = 5;
    public static void displayMessage(String message){
        System.out.println("message:" +message);
        //System.out.println("num = " + num);ERROR num is
        System.out.println("count = " +count);
    }
public static void anotherStaticMethod(){
    System.out.println("another static method");

    displayMessage("wooden spoon");

    }
    //statisticMethods.instanceMethod(); >no
    //static methods stm = new StaticMethods();
    //stm.instantanceMethod();
public void instanceMethod(){
    System.out.println("InstantMethod");
    System.out.println("num ="+num);
    System.out.println("count = "+ count);
    displayMessage("hello from instance method");

}
}
