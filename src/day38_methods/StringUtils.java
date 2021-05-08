
package day38_methods;
import java.util.*;
import static day38_methods.StringUtils.*;

public class StringUtils {
    public static void main(String[] args) {
       System.out.println("isNullOrEmpty(\"hello\") = "+ isNullOrEmpty("hello"));
       String word =null;
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));

    word = "";
        System.out.println(word.toUpperCase());
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }
    //   public static void main(String[] args) {


    public static boolean isNullOrEmpty(String str) {
        //return (str == null|| str.isEmpty());

        if (str == null || str.isEmpty()) {
            return true;

        }
        return false;
    }
}
