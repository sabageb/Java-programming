package day12_boolean_conditional_statement;

public class CompareChars {
    public static void main(String[] args) {

        //letter1 letter2 assign char value
        //print and check if they are equal
        //print and check if letter1

        char letter1 = 'A';
        char letter2 = 'J';

        System.out.println(letter1 == letter2);//65==74
        System.out.println(letter1 > letter2);//65 >74
        System.out.println(letter2 > letter1);

        char grad = 'A';
        boolean pass = grad <= 'D';
        System.out.println("Did you pass the exam? - " + pass);


    }
}
