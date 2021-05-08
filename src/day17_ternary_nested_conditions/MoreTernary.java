package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
  //      int hourlyRate > 45
 //               String reply = "accept";
     //   otherwise
    //            reply ="reject" +
   //             "print "


        String reply = (hourlyRate>45) ? "accept" : "reject";

        System.out.println("reply = " + reply);


        String todayClass = "java";
       // String teacher = "Muralso / Samim"  : "Nadir;


        String teacher= (todayClass.equals("java")) ? "saim | Murildo" : "Nadir";

        System.out.println("today`s teacher = " + teacher);

        boolean isEligibileToDrive = true;
        String driving; //"have DL and Can drive"  "No DL, cannot drive"

        //String = isEligibileToDrive ? "yes have dl , can drive" : "NO DL , cannot drive";

       // System.out.println("driving = " + driving);



    }

}
