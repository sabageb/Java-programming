package day15_Logicalops_switch_ternary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        //Mosco or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("not considering - " + city);
        }


        // System.out.println("willing to relocate to sweden");


        String teacher = "nadir";
        // saim or murdil-> it is a java class with saim
        // otherwise -> soft skill class with nadir


    if (teacher.equals("saim") || teacher.equals("muradil")) {
        System.out.println("it is a java class with " + teacher);
    } else {
        System.out.println("soft skill class with " + teacher);
    }


// 1-teacher Saim or Muradil -> it is a java class
        // 2 - teacher Nadir - soft skill class with
        // any other teacher -> some class with Gurhan/Akbar


        if (teacher.equals("Saim")  ||  teacher.equals("Murodil")) {
            System.out.println("java class with " + teacher);


        } else { if (teacher.equals("Nadir")) {
            System.out.println("soft skills class with" + teacher);
        } else {
            System.out.println("some other class with" + teacher);
        }

         //company - "Google, OR salary >= 100K -> accept offer
         String company = "Google";
        double salary = 85_000.0;


       if (company.equals("Google") || salary >=100_000) {
            System.out.println("accepting offer from " + company);
        } else {
            System.out.println("rejecting offer from " + company);

        }
if (company.equals("Google") && salary >= 100_00) {
    System.out.println("Accepting offer from" + company);
}else {
    System.out.println("Rejecting offer from " + company);
}



        }


    }
}
