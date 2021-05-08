package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println("i");//true
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("j"));// false
        //if company contains space , print "company name with multiple words"
        //else  " single word company name


        if (company.contains(" ")) {
            System.out.println("company name with multiple words");
            System.out.println("single word company name");

        }
    String etsyTitle = "wooden spoon | Etsy";
        // check if " | " is in etsyTitle
        //System.out.println();
    if (etsyTitle.contains(" | ")) {
        System.out.println("pass - title check passed");
    }else {
        System.out.println("fail - title check failed");
    }
   String firstName = "Ahmed";
    // check if firstName contains "a" and "e" at same time

        if(firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a && e are present");
        }else {
            System.out.println("a || e not present");
        }
  firstName = "Nadir";
        if(firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else{
            System.out.println("nor a or i is present");
        }

    String email ="sabageb@gmail.com";

    // check email "@" and ends with .com

        if(email.contains("@") && email.endsWith(".com")) {

            System.out.println("valid email");
        }else {
            System.out.println("invalid email");

        }
    // CASE IN SENSETIVE CONTAINS , 1st convert to lowercase then check if "d" is present

        if(email.toLowerCase().contains("d")){
        System.out.println("d s present");
    }else {
        System.out.println("d is not present");
    }

    }
}