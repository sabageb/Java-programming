package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {

        // most comment sentence split
        String sentence = "java is fun";
        // this will split with space" "
        String[] words = sentence.split(" ");
        System.out.println("1 st word= " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("3rd word = " + words[2]);
        //System.out.println("4th word =" + words[3] ); out of bounds
        for (String w : words) {
            System.out.println(w);

        }
    String  googleResult= "about 1,810,000 results(0.68 seconds)";

String[] results = googleResult.split("  ");
        System.out.println("Count = " + results[1]);
        System.out.println("Seconds = " + results[3].replace(" (", "") );
        System.out.println("Seconds = " + results[3].substring(1) );

    }
}