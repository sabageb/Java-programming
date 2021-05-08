package day13_conditional_statements;

public class ATMPincodePrograms {

    public static void main(String[] args) {

        // print "***WELCOME TO TD BANK ATM ***"
        // if condition checks if secretPincode equals inputPincode
        //true
        //FALSE " Incorrect pincode ! 1234"
        // "please try again.
        // print " Thank you for using TD Bank ATM!"

        System.out.println("****WELCOME TO TD BANK ATM");
        int secretPincode = 2233;
        int inputPincode = 2233;

        if (secretPincode == inputPincode ) {
            System.out.println("Welcome to your account!");
            System.out.println("you can withdraw, check your balance, deposit");
        } else {
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("Please try again!");
        }

System.out.println(" ***THANK YOU FOR USING TD BANK ATM !****");
}
}