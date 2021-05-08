package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {

        //           1234
        String word = "java";
        //           0123
        //1) find duplicates and count

        for (int i = 0; i < word.length(); i++) {//length starts count from 1therefore do not use =
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));// reads the character
            }
            System.out.println();
        }



/**
 * java
 * ava
 * ja
 * j
 * outer : 0- word.length()
 *       inner: outer - word.length()
 */

   for(int i = 0; i < word.length(); i++){
        for(int j=i; j<= word.length();  j++){
            System.out.print(word.charAt(j));

        }
        System.out.println();
}
    }
}
