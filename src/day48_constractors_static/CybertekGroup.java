package day48_constractors_static;

import java.util.Arrays;

public class CybertekGroup {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");//dependency injection. Group object creation depends on String name

        // print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Berk");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

    Group group2 =new Group("CyberCats");
    group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Bulent", "Andrea"));

    //PRINT ALL MEMBERS. Not toString();
        System.out.println("group2 members= " + group2.getMembers());

        //use if statement  to check if AKrem is in group2

        if (group2.getMembers().contains("Akrem")) {
            System.out.println("Akrem is a member of group2");
        }else{
            System.out.println("Akrem is not in group2");
        }



    }



}
