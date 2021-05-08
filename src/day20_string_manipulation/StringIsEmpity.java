package day20_string_manipulation;

public class StringIsEmpity {
    public static void main(String[] args) {
        String jobTitle = "";// string is empty

        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());// it counts for you
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("job Title is missing, please resend");
        } else {
            System.out.println("job Title looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("job Title is empty");

        } else  {
            System.out.println("job title is not empty");

        }
        System.out.println(jobTitle.equals(" "));

            System.out.println("job title is not empty");

            System.out.println(jobTitle.equals(""));
        System.out.println("jobTitle is empty ");

            if ("".equals(jobTitle)) {
                System.out.println(" job title is empty");
            } else {
                System.out.println("job title is not empty");
            }


            String word = " ";// space is a character
            System.out.println(word.isEmpty());// false
            System.out.println(word.length());//1. blanc space is a character

            String veggie = "carrots";
            System.out.println(veggie.isEmpty());//false
            // if veggie is NOT EMPTY . print we have carrot

            if (!veggie.isEmpty()) {
                System.out.println("we have " + veggie);
            }
            String word2;
         //   System.out.println(word2.isEmpty());// ERROR . NOT INITIALIZED. NOT GIVEN VALUE

        }
    }
