
package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
//if statement,if list.substring(i, i +3)equals "cat" or "car"-> print "cat or car found"
        String list = "cat,car";
//                     0123456

        for (int i = 0; i < list.length() - 2; i++) {
            System.out.println(list.substring(i, i + 3));
            if (list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals("cat")) {
                System.out.println("cat or car found");

            }
        }
        for (int i = 0; i < list.length() - 2; i++) {

            String part = list.substring(i, i + 3);
            System.out.println("part = " + part);
            if (part.equals("cat") || part.equals("car")) {
                System.out.println("cat or car found");


                //using substring print first 3 letter

                // int i=0;
                //   System.out.println(list.substring(1, 3));
                //   System.out.println(list.substring(1, 4));
                //   System.out.println(list.substring(2, 5));
                //  System.out.println(list.substring(3, 6));
                //  System.out.println(list.substring(4, 7));
                //  System.out.println(list.substring(i, i+3));
                //  i++;
                // System.out.println(list.substring(i, 5));

            }
        }
    }
}
