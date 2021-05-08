package day19_class_vs_object_string;

//import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word= "CyberTek";
        String sentence = "Java IS FUN!";

        System.out.println(sentence.toLowerCase());
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());



        word.toLowerCase();
        System.out.println(word);


        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLcase);
        // change word to all lowercase letters. and assign back

        word = word.toLowerCase();
        System.out.println("word = " + word);


        String company ="Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable company to " Amazon " to "AMAZON"

        System.out.println("campany = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
