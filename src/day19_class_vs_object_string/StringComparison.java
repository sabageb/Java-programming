package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {


        String city = "Chicago";
        //EQUALS() METHOD-CASE SENSETIVE comparison
       System.out.println(city.equals("Chicago"));//true
        System.out.println(city.equals("chicago"));//false -case sensetive
        System.out.println(city.equals("Chicago "));//false


         //equalsIgnorCaese-case insensetive comparison
        String word = "java";
        System.out.println(word.equalsIgnoreCase("java"));//TRUE
        System.out.println(word.equalsIgnoreCase("JAVA"));//TRUE
        System.out.println(word.equalsIgnoreCase("Java"));//TRUE
        System.out.println(word.equalsIgnoreCase("ja va"));//FALSE
        System.out.println(word.equalsIgnoreCase("JAVA1"));//FALSE


    }
}