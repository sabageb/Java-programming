package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        //java is fun => fun is java
        // wooden spoon
        String sentence="java is fun";
        String[] words = sentence.split(" ");
        String reversed = "";
        // print words array in reverse order
        for(int i=words.length-1; i>=0; i--){
           System.out.println(words[i] + " ");
            reversed += words[i]+" ";
        }

        System.out.println("sentence = " + sentence);
        System.out.println("reversed= " + reversed.trim());

    }
}
