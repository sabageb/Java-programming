package day28_loops;

/**
 * given a string retrieve and print only unique character
 */
public class FindUniqueChars {
    public static void main(String[] args) {
        String word ="java";
String unique="";

for(int i=0; i<word.length(); i++){
            //if word.charAt(i)is not contains in uniq
            // add to unique container
            if(!unique.contains(word.charAt(i) + "")){
                unique+=word.charAt(i);


            }

        }
        System.out.println(unique);

    }

}
