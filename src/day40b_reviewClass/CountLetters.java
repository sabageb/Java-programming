
 package day40b_reviewClass;

/**
  * create a method that will accept a string and print how many times each characters is found  in string
  * ex:"apple tree"
  * output: a-1
  *         p-2
  *         l-1
  *         e-3
  *         -1(space char)
  *         t-1
  *         n-1
  */
 public class CountLetters {


    public static void counterLetters(String str) {
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;

            if (!checked.contains("" + eachLetter)) {


                for (int j = 0; j < str.length(); j++) {
                    char eachOtherLetter = str.charAt(j);

                    if (eachLetter == eachOtherLetter) {
                        count++;

                    }

                }
                System.out.println(eachLetter + "-" + count);
                checked += eachLetter;

            }

        }
    }
}



