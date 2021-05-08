package day15_Logicalops_switch_ternary;

public class GradEvaluator {
    public static void main(String[] args) {


        //char grade= could be one of A,B,C,D,E
        //CHAR grad == 'A';
        // when grade is A or B, C
        //passed with grad
        //when grade is D
        //qualify for retake
        //when grade is E
        //fail
        //anything else invalid grade

        char grade = 'F';
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'C') {
            System.out.println("passed with grade " + grade);

        } else if (grade == 'D') {
            System.out.println(" qualify for retake with grade" + grade);

        } else if(grade == 'E') {
            System.out.println("failed " + grade);

        }else {
            System.out.println("invalide grade " +grade);

        }
    }
}