package day32_arrays_split;
import  java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
        //               0      1       2         3
        String words = "java, pythone,selenium,htlm";

        String[] wordsArray = words.split(";");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(" length of array =  " +wordsArray.length);

        for (String each : wordsArray){
            System.out.println(each);
        }

//                 remove space between the centence
        // commen interview questions
        String sentence =" today I am coding java array";
        sentence.split(" ");
        String[] wordsInSentence = sentence.split(" ");

        System.out.println(wordsInSentence[0]);
        System.out.println(sentence.split(" ")[0] );
        System.out.println("first word: " + wordsInSentence);
        System.out.println("first word : " + sentence.split(" ")[0] );
        System.out.println("number of words in sentence: = " + wordsInSentence.length);


        for( String each :wordsInSentence ){
            System.out.println(each);
        }



    }
}
