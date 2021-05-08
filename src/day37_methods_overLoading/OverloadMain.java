package day37_methods_overLoading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OverloadMain {

    public static void main(String[] args) {
        System.out.println("hello from Real main method");
        main(10);
        System.out.println(Arrays.toString(args));

    }

    /**
     * overloading main method:
     * some name + different parameter
     * jdk does not look for this one to run
     * @param num
     */
    public static void main(int num){
    System.out.println("num = " + num);

}


}
