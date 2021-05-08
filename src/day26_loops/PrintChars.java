
package day26_loops;
public class PrintChars {
    public static void main(String[] args) {
        //String word = "today is java class and we are coding for loops";

         //String word ="java";
         //long way without loop.

        //System.out.print(word.charAt());
        //System.out.println(word.length());
        //System.out.println(word.charAt(0));
       // System.out.println(word.charAt(1));
        //System.out.println(word.charAt(2));
        //System.out.println(word.charAt(3));

         //for(int i=0; i<word.length(); i++)
             //  0123-->index
         // length of java is the 4

       // String name  = "saba";
        //for (int i = 0; i < word.length(); i++) {
          //  System.out.println(i+ " - " + word.charAt(i));


            String  word = "java";
            //for (int i = 3; i >= 0; i--) {
            for(int i= word.length() - 1; i >= 0; i--) {
                //System.out.println(i+ " - " + word.charAt(i));
                System.out.print(word.charAt(i));
            }
        }
    }