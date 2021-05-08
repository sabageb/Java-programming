package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 0;
       if(number>0) {
           System.out.println(number + " is posetive");

       }else if (number<0){
            System.out.println(number + " is negaive");

       }else {// else if (number == 0)
           System.out.println(number + " is zero");
       }
    }





}
