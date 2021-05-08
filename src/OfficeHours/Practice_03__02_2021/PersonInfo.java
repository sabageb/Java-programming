package OfficeHours.Practice_03__02_2021;
// src-> new package called officeHours->new package

public class PersonInfo {

    public static void main(String[] args) {

        //variables without any data
        String name, fullBirthDate, favoriteQuate;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        // Assignment of data
        name = "saba";
        age= 50;
        gender = 'F';
        student = true;
        numberOfSiblings= 3;
        numberOfSeasons=4;
        favoriteNumber=3l;
        birthDate= 3.2;
        year= 2021;

        fullBirthDate =  "" + birthDate + "." +  year;//3.2.2021
        fullBirthDate = birthDate + year + ""; // 2025->add first then turns to String
        //favoriteQuote = "have a good mindset";

        System.out.println(fullBirthDate);
    }
//boolean one =
}

