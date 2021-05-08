package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
      // 0123
// charAt  reads a character at certain index(position and returns 0123-->j is at index 0; a is at index 1..
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
       // System.out.println(word.charAt(4)); ERROR
        System.out.println(word+ "-"+word.length());//4
        String company = "Cybertek";

        System.out.println("first letter:" + company.charAt(0));

        char first = company.charAt(0);
        // C y b e r t e k
  System.out.println(first);// c
 first = company.charAt(0);//c
char second = company.charAt(1);//y
char third = company.charAt(2);//b
char fourth = company.charAt(3);//e
char fifth = company.charAt(4);//r
char sixth =company.charAt(5);//t
char seven = company.charAt(6);//e
char eight = company.charAt(7);//k

        // C y b e r t e k
        System.out.println(first + " " + second+ " " +third+" "+ fourth+" "+fifth+ " "+sixth+" "+seven+" "+eight);

String withSpaces = first + " " + second+ " " +third+" "+ fourth+" "+fifth+
        " "+sixth+" "+seven+" "+eight;

    }
}
