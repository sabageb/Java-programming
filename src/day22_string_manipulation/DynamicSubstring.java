package day22_string_manipulation;

 //* find index ]
 //* provide them as start, end index for substring
 //* to print java

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count :12345";//  result is count :12345
        System.out.println(result.substring(13, 18));
        System.out.println(result.substring(13));


        // find the index of :
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");// index 12 = line 12
        System.out.println(result.substring(colonIndex+1));// by +1 means next character and the rest next in this case is
        // character after colon character

        // now we can combine them into 1 statement
        //System.out.println(result.substring( result.indexOf(":" ));// shows with  colon sign (:)
        System.out.println(result.substring( result.indexOf(":") + 1 ));// by adding +1 it will remove the colon : sign


        // find indexOf [
        //find index ]
        //provide them as start, end index for substring
        // to print java
        String today = " i learned [java] today";

        int start = today.indexOf("[");
        int end = today.indexOf("]");

        System.out.println(today.substring(start+1, end));
        //System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));


}
 }
