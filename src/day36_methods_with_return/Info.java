package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
       fullName();//"mike smith"

        String name =fullName();
        boolean married = isMarried();
        int age= getAge();
        int year = getRandomYear();

        //                                 mike smith
        System.out.println("fullName = " +fullName());
        System.out.println("isMarried = " +isMarried());
        System.out.println("age =" + getAge());
        System.out.println("Birth year =" +getRandomYear());// dynamic. different year each time




    }
    public static String fullName(){
        System.out.println("inside fullName method");
        return "Mike Smith";
    }
    public static boolean isMarried() {
        return false;

    }

public static int getAge() {
        int age = 35;
    return age;//return 35;
    }
public static int getRandomYear(){
        Random random = new Random();

        int randomYear =random.nextInt(2021);
        return randomYear;

}


}
