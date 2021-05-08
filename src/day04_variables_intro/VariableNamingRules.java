package day04_variables_intro;

public class VariableNamingRules {

    public static void main(String[] args){
        System.out.println();
        //int static =22; === error , static is (reserved)taken by java
        int static2 = 22;
        int _static = 22;
        int Static = 44;
        int staticVar = 234;

       // int salary$ = 55;
        //int 1stMonthSalary = 3000;=== can not start with number
        //int $ =10;
        //int _=3;==== not encoraged
        //System.out.println($);
       // System.out.println(_);
        //above variable works fine but not reecommended
        //we should use meaningful variable names
        //int numberoffriends = 401===error
        //int number_of_friends = 401;//not convention
        // int 1stNum = 10; CANNOT START WITH
        int num1 = 10; // works fine
    }
}
